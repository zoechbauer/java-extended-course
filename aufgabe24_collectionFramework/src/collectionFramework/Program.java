package collectionFramework;

public class Program {

   public static void main(String[] args) {

      // example Priority Queue - manage tasks
      System.out.println("\nPriority Queue Beispiel");
      PriorityQueueExample.createAndListTasks();

      // example HashMap - manage students
      System.out.println("\nHashMap Beispiel Studentenverwaltung");
      HashMapExample1.manageStudents();

      // example HashMap - translate text in UI
      System.out.println("\nHashMap Beispiel �bersetzung in UI");
      System.out.println("Gew�hlte Sprache ist Englisch");
      HashMapExample2.translateText("english");
      System.out.println("\nGew�hlte Sprache ist Deutsch");
      HashMapExample2.translateText("german");

      // example TreeSet - merge email lists
      System.out.println("\nTreeSet Beispiel Mail Listen mergen");
      TreeSetExample example = new TreeSetExample();
      example.mergeMailLists();
   }

}
