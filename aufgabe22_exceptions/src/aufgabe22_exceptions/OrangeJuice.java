package aufgabe22_exceptions;

import java.text.MessageFormat;

public class OrangeJuice {
	private String nameString = "Orangensaft";
	private double perfectTemperatureC = 12;
	private double actualTemperatureC;
	
	public OrangeJuice(double actualTemperatureC) {
		this.actualTemperatureC = actualTemperatureC;
	}

	public String getNameString() {
		return nameString;
	}
	
	public double getActualTemperatureC() {
		return actualTemperatureC;
	}
	
	public double getMinDrinkTemperatureC() {
		return this.perfectTemperatureC - 3;
	}

	public double getMaxDrinkTemperatureC() {
		return this.perfectTemperatureC + 3;
	}

}
