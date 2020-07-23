package Aufgabe14_Vererbung;

public class Manager extends Employee {
	// properties
	private int numberOfEmployees;
	
	// ctor
	public Manager(String fn, String ln, long id, int noe) {
		super(fn, ln, id);
		this.setNumberOfEmployees(noe);
		System.out.println("Konstruktor Manager");
	}
	
	public Manager() {}

	// getter/setter
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
}
