package mx.conversor.model;

import java.text.DecimalFormat;

public class Currencies {

	private static double onemxntousd = 0.05299;
	private static double onemxntoeur = 0.04877;
	private static double onemxntogpb = 0.04278;
	private static double onemxntojpy = 6.86512;
	private static double onemxntokrw = 65.23340;
	
	public static String convert(String currencyConversion, double amount) {
		DecimalFormat decimalFormat = new DecimalFormat("#.0000");
		
		switch (currencyConversion) {
			case "De MXN (Peso) a USD (Dolar)" -> { return "Tienes $ " + decimalFormat.format(amount * onemxntousd) + " Dolares"; }
			case "De MXN (Peso) a EUR (Euro)" -> { return "Tienes € " + decimalFormat.format(amount * onemxntoeur) + " Euros"; }
			case "De MXN (Peso) a GBP (Libra Esterlina)" -> { return "Tienes £ " + decimalFormat.format(amount * onemxntogpb) + " Libras Esterlinas"; }
			case "De MXN (Peso) a JPY (Yen Japonés)" -> { return "Tienes ¥ " + decimalFormat.format(amount * onemxntojpy) + " Yenes"; }
			case "De MXN (Peso) a KRW (Won Surcoreano)" -> { return "Tienes ₩ " + decimalFormat.format(amount * onemxntokrw) + " Wones"; }
			case "De USD (Dolar) a MXN (Peso)" -> { return "Tienes $ " + decimalFormat.format(amount / onemxntousd) + " Pesos"; }
			case "De EUR (Euro) a MXN (Peso)" -> { return "Tienes $ " + decimalFormat.format(amount / onemxntoeur) + " Pesos"; }
			case "De GBP (Libra Esterlina) a MXN (Peso)" -> { return "Tienes $ " + decimalFormat.format(amount / onemxntogpb) + " Pesos"; }
			case "De JPY (Yen Japonés) a MXN (Peso)" -> { return "Tienes $ " + decimalFormat.format(amount / onemxntojpy) + " Pesos"; }
			case "De KRW (Won Surcoreano) a MXN (Peso)"-> { return "Tienes $ " + decimalFormat.format(amount / onemxntokrw) + " Pesos"; }
			default -> { return ""; }
		}
	}
}
