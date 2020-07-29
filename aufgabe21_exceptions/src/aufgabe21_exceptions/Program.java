package aufgabe21_exceptions;

import java.util.InputMismatchException;

public class Program {

   public static void main(String[] args) {
      Heater heater = new Heater();
      boolean levelSet = false;

      do {
         try {
            levelSet = heater.setLevel();
         } catch (WrongLevelException e) {
            System.out.printf("Ung�ltige Eingabe: %s%n", e.getMessage());
         } catch (InputMismatchException e) {
            System.out.println("Ung�ltige Eingabe: Sie d�rfen nur Ziffern erfassen");
         } catch (Exception e) {
            e.printStackTrace();
            break;
         }
      } while (!levelSet);

      System.out.println("Ende");
   }

}
