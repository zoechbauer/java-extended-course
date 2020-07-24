package Interface1;

public class Fruit extends SupermarketProducts implements Buyable{
	private double price;
	
	public void buyProduct() {
		System.out.println("Preis: " + this.price);
		System.out.println("Produkt erfolgreich gekauft...");
	}

}
