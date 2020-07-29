package generics;

public class Texter {

   // generic method
   public <T> void printObject(T obj) {
      System.out.println(obj.toString());
   }

   // non-generic method
   public void doSomething() {
      System.out.println("tue etwas ...");
   }

}
