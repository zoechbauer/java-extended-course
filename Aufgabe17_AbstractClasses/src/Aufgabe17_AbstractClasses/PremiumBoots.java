package Aufgabe17_AbstractClasses;

public class PremiumBoots extends Timberland {

   private static final String model = "Premium Boots";

   public PremiumBoots(String sole, String material, String color, boolean waterproof) {
      super(sole, material, color, waterproof);
   }

   public void tieShoes() {
      System.out.printf("%s: Klettverschluss wurde geschlossen.%n%n", this.model);
   }

}
