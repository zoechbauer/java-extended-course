package Aufgabe15_Vererbung;

public class KfW extends Bank {

   public KfW(float creditLimit) {
      super(creditLimit);
      this.setNameOfBank("KfW");
   }
}
