package aufgabe23_clone;

public class Store implements Cloneable {
   private String name;
   private Warehouse warehouse;
   private CashRegister cashRegister;

   public Store(String name, Warehouse warehouse, CashRegister cashRegister) {
      this.name = name;
      this.warehouse = warehouse;
      this.cashRegister = cashRegister;
   }

   // constructor copy - variant 2
   public Store(Store other) {
      this.name = other.getName();
      this.cashRegister = new CashRegister(other.getCashRegister().getMoney());
      this.warehouse = new Warehouse(other.getWarehouse().getAreaInSquareMeters());
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Warehouse getWarehouse() {
      return warehouse;
   }

   public void setWarehouse(Warehouse warehouse) {
      this.warehouse = warehouse;
   }

   public CashRegister getCashRegister() {
      return cashRegister;
   }

   public void setCashRegister(CashRegister cashRegister) {
      this.cashRegister = cashRegister;
   }

   @Override
   public String toString() {
      return String.format("Name des Ladens: %s, Größe des Lagers: %s m2, Kassastand: %d €", this.name,
            this.warehouse.getAreaInSquareMeters(), this.cashRegister.getMoney());
   }

   // deep clone - variant 1
   @Override
   public Store clone() {
      try {
         Store copyStore = (Store) super.clone();
         copyStore.cashRegister = copyStore.cashRegister.clone();
         copyStore.warehouse = copyStore.warehouse.clone();
         return copyStore;
      } catch (CloneNotSupportedException e) {
         System.out.println("Fehler bei Klonen von Store: " + e.getMessage());
      }
      return null;
   }
}
