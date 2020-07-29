package Vererbung2;

public class Dog extends Animal {

   boolean tail;

   Dog(String name, String color, boolean tail) {
      super(name, color);
      this.tail = tail;
      System.out.println("Konstruktor Dog");
   }

}
