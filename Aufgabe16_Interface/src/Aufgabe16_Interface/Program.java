package Aufgabe16_Interface;

public class Program {

   private static boolean Object;

   public static void main(String[] args) {
      Audi audi1 = new Audi("A4", 170);
      Audi audi2 = new Audi("A7", 330);

      Tesla tesla1 = new Tesla("Model 3", 200);
      Tesla tesla2 = new Tesla("Model S", 400);
      Tesla tesla3 = new Tesla("Model X", 360);

      Driveable[] cars = new Driveable[5];
      cars[0] = audi1;
      cars[1] = audi2;
      cars[2] = tesla1;
      cars[3] = tesla2;
      cars[4] = tesla3;

      for (Driveable car : cars) {
         if (car instanceof Tesla) {
            Tesla tesla = (Tesla) car;
            System.out.println(tesla);
            if (tesla.getModel().equalsIgnoreCase("Model S")) {
               // first move
               car.drive(10, 10);
               car.printPosition();
               // 2nd move
               car.drive(15, 30);
               car.printPosition();
            }
         } else if (car instanceof Audi) {
            Audi audi = (Audi) car;
            System.out.println(audi);
         }
      }
   }
}
