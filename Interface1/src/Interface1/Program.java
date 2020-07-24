package Interface1;

public class Program {

	public static void main(String[] args) {
		 Car car1 = new Car(10, 10);
		 Fruit fruit1 = new Fruit();
		 
		 Buyable[] products = new Buyable[10];
		 products[0] = car1;
		 products[1] = fruit1;
	}

}
