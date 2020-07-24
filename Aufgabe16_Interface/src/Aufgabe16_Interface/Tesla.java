package Aufgabe16_Interface;

public class Tesla implements Driveable{
	private String model;
	private int horsePower;
	private int positionX;
	private int positionY;
	
	// ctor
	public Tesla(String model, int horsePower) {
		this.model = model;
		this.horsePower = horsePower;
	}
	
	// getter/setter
	public String getModel() {
		return model;
	}

	// methods
	public void drive(int toPosX, int toPosY) {
		System.out.printf("%s fährt von (%d/%d) nach (%d/%d)%n",
				this.model, this.positionX, this.positionY, toPosX, toPosY);
		this.positionX += toPosX;
		this.positionY += toPosY;
	}
	
	public void printPosition() {
		System.out.printf("%s ist an der Position (%d/%d)%n", 
				this.model, this.positionX, this.positionY);
	}
	
	@Override
	public String toString() {
		return this.model + " mit "  + this.horsePower + " PS";
	}
}
