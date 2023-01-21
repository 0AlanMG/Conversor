package mx.conversor.main;

import javax.swing.JOptionPane;

public class ShowWindows {

	public static Object showMainMenu() {
		/*Menu Principal*/
		Object[] converterOptions = { "Conversor de Moneda", "Conversor de Temperatura" };
		return JOptionPane.showInputDialog(null, 
				"Seleccione una opción de conversión", 
				"Menu", 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				converterOptions, 
				converterOptions[0]
				);
	}

	public static Object showCurrencyConversion() {
		/*Menu de Monedas*/
		Object[] currencyConversionOptions = { 
				"De MXN (Peso) a USD (Dolar)", 
				"De MXN (Peso) a EUR (Euro)", 
				"De MXN (Peso) a GBP (Libra Esterlina)", 
				"De MXN (Peso) a JPY (Yen Japonés)", 
				"De MXN (Peso) a KRW (Won Surcoreano)", 
				"De USD (Dolar) a MXN (Peso)", 
				"De EUR (Euro) a MXN (Peso)", 
				"De GBP (Libra Esterlina) a MXN (Peso)", 
				"De JPY (Yen Japonés) a MXN (Peso)", 
				"De KRW (Won Surcoreano) a MXN (Peso)",
				};
		
		return JOptionPane.showInputDialog(null, 
				"Elije la moneda a la que deseas convertir tu dinero", 
				"Monedas", 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				currencyConversionOptions, 
				currencyConversionOptions[0]
				);
	}
}
