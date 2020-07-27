package aufgabe23_clone;

public class CashRegister implements Cloneable{
	private int money;
	
	public CashRegister(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public CashRegister clone() {
		try {
			return (CashRegister) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Fehler bei Klonen von CashRegister:\n" + e.getMessage());
		}
		return null;
	}

}
