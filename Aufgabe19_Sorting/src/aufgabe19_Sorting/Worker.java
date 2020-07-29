package aufgabe19_Sorting;

public class Worker implements Comparable {
   private int id;
   private String lastName;

   public Worker(int id, String lastName) {
      this.id = id;
      this.lastName = lastName;
   }

   /**
    * sort Worker by lastName and Id
    * 
    */
   @Override
   public int compareTo(Object o) {
      if (!(o instanceof Worker))
         return 0;

      Worker other = (Worker) o;
      if (this.lastName.compareToIgnoreCase(other.lastName) == 0) {
         if (this.id < other.id)
            return -1;
         if (this.id > other.id)
            return 1;
         return 0;
      }
      return this.lastName.compareToIgnoreCase(other.lastName);
   }

   @Override
   public String toString() {
      return String.format("%s, Id=%d", this.lastName, this.id);
   }

}
