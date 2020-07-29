package aufgabe23_clone;

public class Program {

   public static void main(String[] args) {
      // deep copy
      Warehouse warehouse1 = new Warehouse(100);
      CashRegister cashRegister1 = new CashRegister(1000);
      Store store1 = new Store("Oma's Laden", warehouse1, cashRegister1);

      Store store2 = store1.clone();

      store2.setName("Opa's Laden");
      store2.getWarehouse().setAreaInSquareMeters(200);
      store2.getCashRegister().setMoney(500);

      System.out.println("Deep Clone");
      System.out.println(store1);
      System.out.println(store2);

      // constructor copy
      Store store3 = new Store(store1);
      store3.setName("Enkel's Laden");
      store3.getWarehouse().setAreaInSquareMeters(300);
      store3.getCashRegister().setMoney(1500);

      System.out.println("\nConstructor Clone");
      System.out.println(store1);
      System.out.println(store3);

   }

}
