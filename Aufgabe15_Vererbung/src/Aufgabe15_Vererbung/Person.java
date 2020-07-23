package Aufgabe15_Vererbung;

public class Person {
	private String firstName;
	private String lastName;
	private double debitAmount;
	private Bank myBank;
	
	// ctor
	public Person(String firstName, String lastName, double debitAmount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setDebitAmount(debitAmount);
	}
	
	// getter/setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public Bank getMyBank() {
		return myBank;
	}
	public void setMyBank(Bank myBank) {
		this.myBank = myBank;
	}
	
	
}
