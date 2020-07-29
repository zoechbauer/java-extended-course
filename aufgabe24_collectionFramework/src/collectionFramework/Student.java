package collectionFramework;

import java.util.Date;

public class Student {
   final static String UNIVERSITY = "JKU Linz";

   private int matrikelnr;
   private String firstName;
   private String lastName;
   private String university;
   private String subject;
   private Date started;

   public Student(int matrikelnr, String firstName, String lastName, String subject) {
      this.matrikelnr = matrikelnr;
      this.firstName = firstName;
      this.lastName = lastName;
      this.subject = subject;

      this.university = UNIVERSITY;
      this.started = new Date();
   }

   public String getFullname() {
      return this.firstName.trim() + ' ' + this.lastName.trim();
   }

   @Override
   public String toString() {
      return String.format("Der Student %s hat die Matrikelnr %d und studiert %s an der %s", this.getFullname(),
            this.matrikelnr, this.subject, this.university);
   }

}
