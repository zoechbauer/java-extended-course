package ComparableInterface;

public class Student implements Comparable {
   private String firstName;
   private String lastName;
   private int age;
   private String additionalInfos;

   // ctor
   public Student(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
   }

   // methods
   @Override
   public int compareTo(Object o) {
      if (!(o instanceof Student))
         return 0;

      Student other = (Student) o;
      if (this.age < other.age)
         return -1;
      if (this.age > other.age)
         return 1;
      return 0;
   };

   public String toString() {
      return String.format("%s %s, Alter: %d", this.firstName, this.lastName, this.age);
   }
}
