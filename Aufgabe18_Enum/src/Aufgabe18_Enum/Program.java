package Aufgabe18_Enum;

public class Program {

   public static void main(String[] args) {
      Pencil pencil = new Pencil("Bleistift", 1, Currency.EURO);
      pencil.buyProduct();

      BottleBeer beer = new BottleBeer("Gösser", 0.8, Currency.USDOLLAR);
      beer.buyProduct();

   }

}
