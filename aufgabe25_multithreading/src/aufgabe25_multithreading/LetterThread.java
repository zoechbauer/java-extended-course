package aufgabe25_multithreading;

/**
 * Thread-Example of extending Thread Class
 * 
 * @author zoe
 *
 */
public class LetterThread extends Thread {

   @Override
   public void run() {
      do {
         char[] word = new char[5];
         for (int i = 0; i < word.length; i++) {
            word[i] = generateLowerCaseLetter();
         }
         Utils.randomDelay();
         Utils.printGeneratedString(String.valueOf(word));
         Statistics.incrementWordCounter();
      } while (!isInterrupted());
   }

   private char generateLowerCaseLetter() {
      char[] lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      int random = (int) (Math.random() * 26);
      return lowerCaseLetters[random];
   }

}
