package aufgabe25_multithreading;

/**
 * This class shows the usage of synchronized methods
 * 
 * @author zoe
 *
 */
public class Statistics {

   static int wordCounter = 0;
   static int numberCounter = 0;

   public static synchronized void incrementWordCounter() {
      wordCounter++;
   }

   public static synchronized void incrementNumberCounter() {
      numberCounter++;
   }

   public static void printStatistics() {
      System.out.println("\nW�rter und Zalen Statistik");
      System.out.printf("Anzahl W�rter: %d, Anzahl Zahlen: %d, Gesamt: %d %n", wordCounter, numberCounter,
            wordCounter + numberCounter);
   }

}
