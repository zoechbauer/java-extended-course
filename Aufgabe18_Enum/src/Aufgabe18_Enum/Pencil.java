package Aufgabe18_Enum;

public class Pencil extends Product {

   public Pencil(String name, double price, Currency currency) {
      super(name);
      this.setCurrency(currency);
      this.setPrice(price);
   }

}
