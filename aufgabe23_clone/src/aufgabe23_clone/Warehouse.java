package aufgabe23_clone;

public class Warehouse implements Cloneable {
	private int areaInSquareMeters;
	
	public Warehouse(int areaInSquareMeters) {
		this.areaInSquareMeters = areaInSquareMeters;
	}
	
	public int getAreaInSquareMeters() {
		return areaInSquareMeters;
	}

	public void setAreaInSquareMeters(int areaInSquareMeters) {
		this.areaInSquareMeters = areaInSquareMeters;
	}

	@Override
	public Warehouse clone() {
		try {
			return (Warehouse) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Fehler clonen Warehouse:\n" + e.getMessage());
		}
		return null;
	}
}
