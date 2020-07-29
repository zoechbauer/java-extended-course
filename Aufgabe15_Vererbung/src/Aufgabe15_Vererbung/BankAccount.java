package Aufgabe15_Vererbung;

public class BankAccount {
   private Person person;
   private double balance;

   // ctor
   public BankAccount() {
   }

   public BankAccount(Person person, double initalAmount) {
      this.person = person;
      this.balance = initalAmount;
   }

   // getter/setter
   public Person getPerson() {
      return person;
   }

   public void setPerson(Person person) {
      this.person = person;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   // methods
   @Override
   public String toString() {
      return "Person: " + this.person.getLastName() + " - Saldo: " + this.balance;
   }

}
