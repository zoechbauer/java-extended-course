package Aufgabe17_AbstractClasses;

public class Program {

	public static void main(String[] args) {
		NmdR1 shoe1 = new NmdR1("Leder", "Leder", "braun", false);
		shoe1.cleanWithWater();
		shoe1.tieShoes();
		
		UltraBoost shoe2 = new UltraBoost("Gummi", "Kunststoff", "weiﬂ", true);
		shoe2.cleanWithWater();
		shoe2.tieShoes();
		
		PremiumBoots shoe3 = new PremiumBoots("Gummi", "Kunstoff", "Hellblau", true);
		shoe3.cleanWithWater();
		shoe3.tieShoes();
	}

}
