package mx.conversor.model;

public class Currencies {

	private static double onemxntousd = 0.05299;
	private static double onemxntoeur = 0.04877;
	private static double onemxntogpb = 0.04278;
	private static double onemxntojpy = 6.86512;
	private static double onemxntokrw = 65.23340;
	
	public static double convert(String currencyConversion, double amount) {
		switch (currencyConversion) {
			case "De MXN (Peso) a USD (Dolar)" -> { return amount * onemxntousd; }
			case "De MXN (Peso) a EUR (Euro)" -> { return amount * onemxntoeur; }
			case "De MXN (Peso) a GBP (Libra Esterlina)" -> { return amount * onemxntogpb; }
			case "De MXN (Peso) a JPY (Yen Japonés)" -> { return amount * onemxntojpy; }
			case "De MXN (Peso) a KRW (Won Surcoreano)" -> { return amount * onemxntokrw; }
			case "De USD (Dolar) a MXN (Peso)" -> { return amount / onemxntousd; }
			case "De EUR (Euro) a MXN (Peso)" -> { return amount / onemxntoeur; }
			case "De GBP (Libra Esterlina) a MXN (Peso)" -> { return amount / onemxntogpb; }
			case "De JPY (Yen Japonés) a MXN (Peso)" -> { return amount / onemxntojpy; }
			case "De KRW (Won Surcoreano) a MXN (Peso)"-> { return amount / onemxntokrw; }
			default -> { return Double.valueOf(null); }
		}
	}
}
