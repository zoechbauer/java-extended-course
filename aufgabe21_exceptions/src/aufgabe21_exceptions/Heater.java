package aufgabe21_exceptions;

import java.util.Scanner;

public class Heater {

   private Byte level;

   public Heater() {
   };

   public boolean setLevel() throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.print("Bitte geben Sie die Heizungsstufe ein: ");
      Byte inputByte = sc.nextByte();
      if (inputByte < 0 || inputByte > 5) {
         throw new WrongLevelException("Falsche Heizungsstufe (gültige Werte: 0-5)");
      }
      this.level = inputByte;
      System.out.println("Neue Heizungsstufe: " + this.level);
      return true;
   }

}
