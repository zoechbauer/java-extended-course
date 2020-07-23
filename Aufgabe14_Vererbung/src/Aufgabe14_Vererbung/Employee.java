package Aufgabe14_Vererbung;

public class Employee extends Person {
	// properties
	private long employeeID;	
	
	// ctor
	public Employee(String fn, String ln, long id) {
		super(fn, ln);
		this.setEmployeeID(id);
		System.out.println("Konstruktor Employee");
	}
	
	public Employee() {}
	
	// getter/setter
	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
}
