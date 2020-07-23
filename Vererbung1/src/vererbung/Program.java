package vererbung;

import test.Fish;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.purr();
		cat.sleep();
		cat.color = "schwarz";
		System.out.println(cat.color);
		
		Dog dog = new Dog();
		dog.bark();
		dog.sleep();
		
		Fish fish = new Fish();
		fish.sleep();
		fish.color = "weiﬂ";
		fish.sayColor();

	}

}
