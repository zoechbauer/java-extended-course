package aufgabe22_exceptions;

public class JuiceStore {
	
	private int stock;
	
	public JuiceStore(int stock) {
		this.stock = stock;
	}
	
	public void CustomerBuyOrangeJuice(Customer customer, OrangeJuice juice, int quantity) 
			throws OutOfStockException, TemperatureException{
		
		System.out.printf("\nLagerbestand: %s ==> %s bestellt %s Gl. %s%n", 
				this.stock, customer.getNameString(), quantity, juice.getNameString());
		
		// check stock quantity
		if (this.stock <= 0)  {
			throw new OutOfStockException("Es ist kein Orangejuice mehr verf�gbar.");
		}
		if (stock <= 0) {
			throw new OutOfStockException(String.format("Es ist kein %s mehr verf�gbar.", juice.getNameString()));
			
		}
		if (stock - quantity < 0) {
			throw new OutOfStockException(String.format("Es sind nur mehr %d Gl�ser %s verf�gbar.", 
					this.stock, juice.getNameString()));
		}
		this.stock -= quantity;
		
		// customer feedback of drink quality
		customer.drinkOrangeJuice(juice, quantity);
		
		
	}

}
