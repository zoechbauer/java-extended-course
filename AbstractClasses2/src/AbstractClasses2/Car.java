package AbstractClasses2;

public abstract class Car implements Driveable {
	
	private int horsePower;
	
	public void drive() {
		System.out.println("das Auto f�hrt ...");
	}
	
	public abstract void openDoor();

}
