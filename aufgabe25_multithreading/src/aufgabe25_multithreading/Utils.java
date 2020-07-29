package aufgabe25_multithreading;

/**
 * This Class is used by LetterThread and NumberThread
 * 
 * @author zoe
 *
 */
public class Utils {

   public static void randomDelay() {
      int time = (int) (Math.random() * 1000);
      try {
         Thread.sleep(time);
      } catch (InterruptedException e) {
         // e.printStackTrace();
         System.out.printf("%s schlief als die Nachricht *** %s *** kam.%n", Thread.currentThread().getName(),
               e.getMessage());
         Thread.currentThread().interrupt();
      }
   }

   public static void printGeneratedString(String word) {
      String threadNameString = Thread.currentThread().getName();
      System.out.printf("%s : %s %n", threadNameString, word);
   }

}
