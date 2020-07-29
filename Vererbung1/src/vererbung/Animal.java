package vererbung;

public class Animal {
   // properties
   protected String name;
   protected int age;
   private String color;
   protected String favFood;

   // methods
   public void move() {
      System.out.println("Geschwindigkeit: 10 km/h");
   }

   public void sleep() {
      System.out.println("ich schlafe gerade ...");
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

}
