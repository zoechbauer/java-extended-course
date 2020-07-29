package aufgabe20_Strings;

import java.util.Scanner;

public class Program {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String word;

      do {
         System.out.print("Bitte geben Wie ein Wort ein (Leerstring = Ende): ");
         word = scanner.nextLine();

         if (word.isEmpty())
            break;

         System.out.printf("%nVertauschen 1. u letzter Buchstabe%n");
         System.out.printf("%s ==> %s%n%n", word, Mixer.changeFirstWithLastCharacter(word));

         System.out.println("Vertauschen der Wort-H�lften");
         System.out.printf("%s ==> %s%n%n", word, Mixer.divideWord(word));

         System.out.println("Letzen 3 Zeichen in Gro�buchstaben");
         System.out.printf("%s ==> %s%n%n", word, Mixer.convertLast3CharsToUppercase(word));

      } while (!word.isEmpty());
      System.out.println("Ende");
   }

}
