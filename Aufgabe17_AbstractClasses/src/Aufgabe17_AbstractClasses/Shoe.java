package Aufgabe17_AbstractClasses;

public abstract class Shoe {
	
	private String sole;
	private String material;
	private String color;
	private boolean waterproof;

	public Shoe(String sole, String material, String color, boolean waterproof) {
		this.sole = sole;
		this.material = material;
		this.color = color;
		this.waterproof = waterproof;
	}
	
	void cleanWithWater() {
		System.out.println("Der Schuh wurde mit Wasser gereinigt.");
	}
	
	public abstract void tieShoes();
	

}
