package generics;

public class Program {

   public static void main(String[] args) {
      // using a generic class
      Box<Integer> box1 = new Box<Integer>(20);
      System.out.println(box1.getObjectInBox());
      box1.setObjectInBox(10);
      System.out.println(box1.getObjectInBox());

      Box<String> box2 = new Box<String>("Teststring");
      System.out.println(box2.getObjectInBox());
      box2.setObjectInBox("Text wurde geändert");
      System.out.println(box2.getObjectInBox());

      Plate plate = new Plate(30);
      Box<Plate> box3 = new Box<Plate>(plate);
      System.out.println(box3.getobjectInBox());

      // using a generic method of a non-generic class
      System.out.println();
      Texter texter = new Texter();
      texter.printObject("Test");
      texter.printObject(13);
      texter.printObject(plate);
      texter.doSomething();

   }

}
