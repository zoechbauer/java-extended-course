package Aufgabe14_Vererbung;

public class Program {

   public static void main(String[] args) {
      Manager mgr1 = new Manager("Fritz", "Müller", 10, 1);
      Manager mgr2 = new Manager("Franz", "Maier", 5, 2);
      Manager mgr3 = new Manager();

      Assistant ass1 = new Assistant("Sabine", "Emsig", 3, 30);
      Assistant ass2 = new Assistant();
   }

}
