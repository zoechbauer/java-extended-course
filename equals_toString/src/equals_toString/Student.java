package equals_toString;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private String additionalInfos;
	
	// ctor
	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// methods
	@Override
	public String toString() {
		return String.format("%s %s, Alter: %d", 
				this.firstName, this.lastName, this.age);
				
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Student)) return false;
		
		Student other = (Student) obj;
		if (this.firstName.equals(other.firstName) &&
			this.lastName.equals(other.lastName) &&
			this.age == other.age) {
			return true;
		}
		return false;
	}

}
