package aufgabe22_exceptions;

public class OutOfStockException extends Exception {

   public OutOfStockException(String message) {
      super(message);
   }
}
