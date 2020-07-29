package Aufgabe17_AbstractClasses;

public abstract class Nike extends Shoe {

   private final String brandString = "Nike";
   private int guaranteeInDays = 40;

   public Nike(String sole, String material, String color, boolean waterproof) {
      super(sole, material, color, waterproof);
   }

}
