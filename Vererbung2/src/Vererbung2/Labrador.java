package Vererbung2;

public class Labrador extends Dog {
	
	String nickName;
	
	Labrador(String name, String color, boolean tail, String nickName) {
		super(name, color, tail);
		this.nickName = nickName;
		System.out.println("Konstruktor Labrador");
	}

}
