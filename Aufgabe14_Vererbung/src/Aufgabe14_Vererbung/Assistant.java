package Aufgabe14_Vererbung;

public class Assistant extends Employee {
	// properties
	private int hoursPerWeek;
	
	// ctor
	Assistant(String fn, String ln, long id, int hpw) {
		super(fn, ln, id);
		this.setHoursPerWeek(hpw);
		System.out.println("Konstruktor Assistant");
	}
	
	Assistant() {}

	// getter/setter
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

}
