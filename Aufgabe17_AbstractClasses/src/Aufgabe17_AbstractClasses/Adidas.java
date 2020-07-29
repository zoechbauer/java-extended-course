package Aufgabe17_AbstractClasses;

public abstract class Adidas extends Shoe {

   private final String brand = "Adidas";
   private int guaranteeInDays = 30;

   public Adidas(String sole, String material, String color, boolean waterproof) {
      super(sole, material, color, waterproof);
   }

}
