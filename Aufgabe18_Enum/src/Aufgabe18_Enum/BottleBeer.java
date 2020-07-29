package Aufgabe18_Enum;

public class BottleBeer extends Product {

   public BottleBeer(String name, double price, Currency currency) {
      super(name);
      this.setPrice(price);
      this.setCurrency(currency);
   }

}
