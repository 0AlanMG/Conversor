package mx.conversor.model;

public class Temperatures {
	
	public static double convert(String temperatureConversion, double degrees) {
		switch (temperatureConversion) {
			case "De ºC (Celsius) a ºF (Fahrenheit)" -> { return (degrees * 1.8) + 32; }
			case "De ºC (Celsius) a K (Kelvin)" -> { return degrees + 273.15; }
			case "De ºF (Fahrenheit) a ºC (Celsius)" -> { return (degrees - 32) / 1.8; }
			case "De ºF (Fahrenheit) a K (Kelvin)" -> { return (((degrees - 32) * 5 ) / 9) + 273.15; }
			case "De K (Kelvin) a KRW ºC (Celsius)" -> { return degrees - 273.15; }
			case "De K (Kelvin) a MXN ºF (Fahrenheit)" -> { return (1.8 * (degrees - 273.15)) + 32; }
			default -> { return Double.valueOf(null); }
		}
	}
}
