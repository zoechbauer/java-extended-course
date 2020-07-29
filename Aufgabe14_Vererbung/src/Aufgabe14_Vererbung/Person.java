package Aufgabe14_Vererbung;

public class Person {
   // properties
   private String firstName;
   private String lastName;

   // ctor
   public Person(String fn, String ln) {
      this.setFirstName(fn);
      this.setLastName(ln);
      System.out.println("Konstruktor Person");
   }

   // getter/setter
   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Person() {
   }

}
