package Aufgabe18_Enum;

public abstract class Product {
	private String name;
	private double price;
	private Currency currency;
	
	// ctor
	public Product(String name) {
		this.name = name;
	}

	// getter/setter
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	// methods
	public void buyProduct() {
		System.out.printf("Das Produkt %s wurde zum Preis von %s %s verkauft.%n", 
				this.name, this.getPrice(), this.getCurrency());
	}

	
}
