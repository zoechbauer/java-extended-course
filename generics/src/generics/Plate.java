package generics;

public class Plate {
   private int diameter;

   public Plate(int diameter) {
      this.diameter = diameter;
   }

   @Override
   public String toString() {
      return "Teller-Durchmesser: " + this.diameter;
   }

}
