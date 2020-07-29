package collectionFramework;

public class Email implements Comparable<Email> {
   public String firstName;
   public String lastName;
   public String email;
   // and so on

   public Email(String firstName, String lastName, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

   @Override
   public String toString() {
      return String.format("%s => %s", this.firstName.trim() + ' ' + this.lastName.trim(), this.email);
   }

   @Override
   public int compareTo(Email other) {
      return this.email.compareTo(other.email);
   }
}
