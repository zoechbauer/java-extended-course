package Interface1;

public class Car implements Buyable {
   private int xPosition;
   private int yPosition;
   private double price;

   Car(int x, int y) {
      this.xPosition = x;
      this.yPosition = y;
   }

   public void buyProduct() {
      System.out.println("Preis: " + this.price);
      System.out.println("Produkt erfolgreich gekauft...");
   }

}
