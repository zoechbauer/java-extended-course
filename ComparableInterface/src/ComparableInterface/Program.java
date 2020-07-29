package ComparableInterface;

import java.util.Arrays;

public class Program {

   public static void main(String[] args) {
      // standard sort method
      String[] words = { "red", "green", "blue", "organge" };
      Arrays.sort(words);
      for (String word : words) {
         System.out.println(word);
      }

      // separate sort method
      Student[] students = new Student[3];
      students[0] = new Student("Max", "Mustermann", 22);
      students[1] = new Student("Franz", "Müller", 33);
      students[2] = new Student("Lisa", "Klein", 18);

      // sort students by age asc
      Arrays.sort(students);
      for (Student student : students) {
         System.out.println(student);
      }
   }

}
