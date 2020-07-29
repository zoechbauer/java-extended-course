package aufgabe22_exceptions;

public class Program {

   public static void main(String[] args) {
      boolean finished = false;
      int step = 0;

      JuiceStore store = new JuiceStore(3); // init stock
      Customer customer1 = new Customer("Kunde 1");
      Customer customer2 = new Customer("Kunde 2");

      do {
         try {
            step++;

            switch (step) {
            case 1:
               OrangeJuice juice1 = new OrangeJuice(7);
               store.CustomerBuyOrangeJuice(customer1, juice1, 1);
               break;

            case 2:
               OrangeJuice juice2 = new OrangeJuice(16);
               store.CustomerBuyOrangeJuice(customer2, juice2, 1);
               break;

            case 3:
               OrangeJuice juice3 = new OrangeJuice(12);
               store.CustomerBuyOrangeJuice(customer1, juice3, 5);
               break;

            case 4:
               OrangeJuice juice4 = new OrangeJuice(12);
               store.CustomerBuyOrangeJuice(customer1, juice4, 1);
               break;

            case 5:
               OrangeJuice juice5 = new OrangeJuice(12);
               store.CustomerBuyOrangeJuice(customer1, juice5, 1);
               break;

            default:
               finished = true;
               break;
            }

         } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
         } catch (TemperatureException e) {
            System.out.println(e.getMessage());
         }
      } while (!finished);

      // customer data
      System.out.println();
      System.out.println("Kundenstatistik");
      System.out.printf("%s: zu kalt %d, zu warum %d, optimale Temperatur %d%n", customer1.getNameString(),
            customer1.getOrangeJuiceToCold(), customer1.getOrangeJuiceToWarm(),
            customer1.getOrangeJuiceOptimalTemperature());
      System.out.printf("%s: zu kalt %d, zu warum %d, optimale Temperatur %d%n", customer2.getNameString(),
            customer2.getOrangeJuiceToCold(), customer2.getOrangeJuiceToWarm(),
            customer2.getOrangeJuiceOptimalTemperature());

      System.out.println("\nEnde");
   }
}

//output to console
//
//Lagerbestand: 3 ==> Kunde 1 bestellt 1 Gl. Orangensaft
//Orangensaft ist zu kalt.
//
//Lagerbestand: 2 ==> Kunde 2 bestellt 1 Gl. Orangensaft
//Orangensaft ist zu warm.
//
//Lagerbestand: 1 ==> Kunde 1 bestellt 5 Gl. Orangensaft
//Es sind nur mehr 1 Gläser Orangensaft verfügbar.
//
//Lagerbestand: 1 ==> Kunde 1 bestellt 1 Gl. Orangensaft
//Trinkvorgang erfolgreich. Orangensaft hatte die ideale Temperatur!
//
//Lagerbestand: 0 ==> Kunde 1 bestellt 1 Gl. Orangensaft
//Es ist kein Orangejuice mehr verfügbar.
//
//Kundenstatistik
//Kunde 1: zu kalt 1, zu warum 0, optimale Temperatur 1
//Kunde 2: zu kalt 0, zu warum 1, optimale Temperatur 0
//
//Ende
