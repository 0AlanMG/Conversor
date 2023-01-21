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

	public static Object showConversion(String typeConversion, String title, String message) {
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
		
		/*Menu de Temperaturas*/
		Object[] temperatureConversionOptions = { 
				"De ºC (Celsius) a ºF (Fahrenheit)", 
				"De ºC (Celsius) a K (Kelvin)", 
				"De ºF (Fahrenheit) a ºC (Celsius)", 
				"De ºF (Fahrenheit) a K (Kelvin)", 
				"De K (Kelvin) a ºC (Celsius)", 
				"De K (Kelvin) a ºF (Fahrenheit)"
				};
		
		Object[] conversionOptions = null;
		
		if(typeConversion == "currency") {
			conversionOptions = currencyConversionOptions;
		}else if(typeConversion == "temperature") {
			conversionOptions = temperatureConversionOptions;
		}
		
		return JOptionPane.showInputDialog(null, 
				message, 
				title, 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				conversionOptions, 
				conversionOptions[0]
				);
	}
	
	public static Object showInputNumber(String title, String message) {
		return JOptionPane.showInputDialog(null, 
				message, 
				title, 
				JOptionPane.QUESTION_MESSAGE 
				);
	}

	public static void showConversionValue(String message) {
		JOptionPane.showMessageDialog(null, 
				message, 
				"Conversión", 
				JOptionPane.INFORMATION_MESSAGE
				);
	}

	public static Object showQuestionCloseProgram() {
		return JOptionPane.showConfirmDialog(null, 
				"¿Desea continuar?", 
				"Selecione una opción", 
				JOptionPane.YES_NO_CANCEL_OPTION);
	}
	
	public static void showCloseProgram() {
		JOptionPane.showMessageDialog(null, 
				"Programa terminado", 
				"Mensaje", 
				JOptionPane.INFORMATION_MESSAGE 
				);
	}
	
	public static void showError(String message) {
		/*Error*/
		JOptionPane.showMessageDialog(null, message, "Aviso", JOptionPane.ERROR_MESSAGE);
	}
}
