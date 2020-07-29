package Aufgabe17_AbstractClasses;

public class NmdR1 extends Adidas {

   private static final String model = "NMD R1";

   public NmdR1(String sole, String material, String color, boolean waterproof) {
      super(sole, material, color, waterproof);
   }

   public void tieShoes() {
      System.out.printf("%s: Schuh wurde gebunden.%n%n", this.model);
   }

}
