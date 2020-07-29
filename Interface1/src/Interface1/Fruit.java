package Interface1;

public class Fruit extends SupermarketProducts implements Buyable {
   private double price;

   public void buyProduct() {
      System.out.println("Preis: " + this.price);
      System.out.println("Produkt erfolgreich gekauft...");
   }

   @Override
   public void testMethode() {
      System.out.println("Das ist die überschriebene Testmethode");
   }

}
