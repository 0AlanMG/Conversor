package mx.conversor.model;

import java.text.DecimalFormat;

public class Temperatures {
	
	public static String convert(String temperatureConversion, double degrees) {
		DecimalFormat decimalFormat = new DecimalFormat("#.000");
		
		switch (temperatureConversion) {
			case "De ºC (Celsius) a ºF (Fahrenheit)" -> { return "Son " + decimalFormat.format((degrees * 1.8) + 32) + " ºF"; }
			case "De ºC (Celsius) a K (Kelvin)" -> { return "Son " + decimalFormat.format(degrees + 273.15) + " K"; }
			case "De ºF (Fahrenheit) a ºC (Celsius)" -> { return "Son " + decimalFormat.format((degrees - 32) / 1.8) + " ºC"; }
			case "De ºF (Fahrenheit) a K (Kelvin)" -> { return "Son " + decimalFormat.format((((degrees - 32) * 5 ) / 9) + 273.15) + " K"; }
			case "De K (Kelvin) a ºC (Celsius)" -> { return "Son " + decimalFormat.format(degrees - 273.15) + " ºC"; }
			case "De K (Kelvin) a ºF (Fahrenheit)" -> { return "Son " + decimalFormat.format((1.8 * (degrees - 273.15)) + 32) + " ºF"; }
			default -> { return ""; }
		}
	}
}
