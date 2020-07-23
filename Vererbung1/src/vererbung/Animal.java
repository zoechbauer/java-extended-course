package vererbung;


public class Animal {
	// properties
	protected String name;
	protected int age;
	private String color = "weiﬂ";
	protected String favFood;
	
	// methods
	protected void sleep() {
		System.out.println("ich schlafe gerade ...");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
