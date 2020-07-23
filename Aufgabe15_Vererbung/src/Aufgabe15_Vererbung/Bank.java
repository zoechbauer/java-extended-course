package Aufgabe15_Vererbung;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.x500.X500Principal;

public class Bank {
	private String nameOfBank;
	private double creditLimit;
	private List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	
	//ctor
	public Bank() {}
	
	public Bank(double creditLimit) {
		this.setCreditLimit(creditLimit);
	}
	
	// getter/setter
	public String getNameOfBank() {
		return nameOfBank;
	}
	public void setNameOfBank(String name) {
		this.nameOfBank = name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	// methods
	public void openBankAccout(Person person) {
		// create bank Account
		this.createBankAccount(person);
		
		// print customer info
		System.out.println();
		System.out.println("Hallo Herr " + person.getLastName());
		System.out.println("Sie haben Ihr Konto erfolgreich eröffnet:");
		System.out.println();
		
		System.out.println("Name der Bank: " + this.getNameOfBank());
		System.out.printf("Ihr Kontostand: %.2f%n", this.getBankAccountBalance(person));
		System.out.printf("Kreditlimit: %.2f%n", this.getCreditLimit());
		System.out.println("Wir freuen uns auf Ihren nächsten Besuch!");
		System.out.println("**********************************************");
		
		person.setMyBank(this);
		
		this.createBankAccount(person);
		this.getBankAccountBalance(person);
	}
	
	private void createBankAccount(Person person) {
		BankAccount bankAccount = new BankAccount(person, person.getDebitAmount());
		this.bankAccounts.add(bankAccount);
		// System.out.println("CreateBA: " + this.bankAccounts.size());
	}
	
	private double getBankAccountBalance(Person person) {
		for(BankAccount bankAccount : this.bankAccounts) {
			// System.out.println("Person: " + person.getLastName() + "\nBankAccount: " + bankAccount.toString());
			if (bankAccount.getPerson().equals(person)) {
				return bankAccount.getBalance();
			}
		}
		return -1;
	}
	
}
