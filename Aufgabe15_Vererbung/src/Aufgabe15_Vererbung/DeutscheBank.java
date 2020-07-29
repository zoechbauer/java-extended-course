package Aufgabe15_Vererbung;

public class DeutscheBank extends Bank {

   public DeutscheBank(double creditLimit) {
      super(creditLimit);
      this.setNameOfBank("Deutsche Bank");
   }

}
