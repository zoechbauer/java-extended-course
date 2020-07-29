package aufgabe22_exceptions;

public class Customer {

   private String nameString;
   private int orangeJuiceToCold;
   private int orangeJuiceToWarm;
   private int orangeJuiceOptimalTemperature;

   public Customer(String name) {
      this.nameString = name;
   }

   public String getNameString() {
      return nameString;
   }

   public int getOrangeJuiceToCold() {
      return orangeJuiceToCold;
   }

   public int getOrangeJuiceToWarm() {
      return orangeJuiceToWarm;
   }

   public int getOrangeJuiceOptimalTemperature() {
      return orangeJuiceOptimalTemperature;
   }

   public void drinkOrangeJuice(OrangeJuice juice, int quantity) throws TemperatureException {
      if (juice.getActualTemperatureC() < juice.getMinDrinkTemperatureC()) {
         this.orangeJuiceToCold += quantity;
         throw new TemperatureException(String.format("%s ist zu kalt.", juice.getNameString()));
      }
      if (juice.getActualTemperatureC() > juice.getMaxDrinkTemperatureC()) {
         this.orangeJuiceToWarm += quantity;
         throw new TemperatureException(String.format("%s ist zu warm.", juice.getNameString()));
      }
      this.orangeJuiceOptimalTemperature += quantity;
      System.out.printf("Trinkvorgang erfolgreich. %s hatte die ideale Temperatur!%n", juice.getNameString());
   }
}
