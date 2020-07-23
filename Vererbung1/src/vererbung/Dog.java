package vererbung;
public class Dog extends Animal {
	
	Dog(String color) {
		super(color);
	}

	void bark() {
		System.out.println("bellen");
	}
	
	public void sayColor() {
		System.out.println("Meine Farbe ist " + getColor());
	}

}
