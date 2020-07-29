package aufgabe25_multithreading;

/**
 * Thread-Example of implementing Runnable Interface
 * 
 * @author zoe
 *
 */
public class NumberThread implements Runnable {

   public void run() {
      int stringLength = 5;
      do {
         String numberString = "";
         for (int i = 0; i < stringLength; i++) {
            numberString += generateDigit();
         }
         Utils.randomDelay();
         Utils.printGeneratedString(numberString);
         Statistics.incrementNumberCounter();
      } while (!Thread.currentThread().isInterrupted());

   }

   private int generateDigit() {
      return (int) (Math.random() * 9);
   }

}
