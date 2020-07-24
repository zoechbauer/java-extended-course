package Aufgabe17_AbstractClasses;

public abstract class Timberland extends Shoe{
	
	private final String brandString = "Timberland";
	private int guaranteeInDays = 50;
	
	public Timberland (String sole, String material, String color, boolean waterproof) {
		super(sole, material, color, waterproof);
	}

}
