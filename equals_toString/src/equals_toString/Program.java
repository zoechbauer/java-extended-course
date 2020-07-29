package equals_toString;

public class Program {

   public static void main(String[] args) {
      Student student1 = new Student("Max", "Mustermann", 22);
      Student student2 = new Student("Max", "Mustermann", 22);

      // step 1: use standard Object.methods of toString() and equal()

      // print object
      System.out.println(student1);
      // console output: equals_toString.Student@15db9742
      System.out.println(student1.toString());
      // equals_toString.Student@15db9742

      // conpare object
      System.out.println(student1 == student2);
      // false
      System.out.println(student1.equals(student2));
      // false

      // step 2: use overridden Object.methods of toString() and equal()

      // print object
      System.out.println(student1);
      // Max Mustermann, Alter: 22
      System.out.println(student1.toString());
      // Max Mustermann, Alter: 22

      // conpare object
      System.out.println(student1 == student2);
      // false
      System.out.println(student1.equals(student2));
      // true
   }

}
