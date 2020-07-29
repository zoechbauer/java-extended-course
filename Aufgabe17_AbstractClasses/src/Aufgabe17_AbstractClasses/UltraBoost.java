package Aufgabe17_AbstractClasses;

public class UltraBoost extends Adidas {

   private static final String model = "Ultra Boost";

   public UltraBoost(String sole, String material, String color, boolean waterproof) {
      super(sole, material, color, waterproof);
   }

   public void tieShoes() {
      System.out.printf("%s: Klettverschluss wurde geschlossen.%n%n", this.model);
   }

}
