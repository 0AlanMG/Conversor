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
	
	public static Object showTemperatureConversion() {
		/*Menu de Temperaturas*/
		Object[] temperatureConversionOptions = { 
				"De ºC (Celsius) a ºF (Fahrenheit)", 
				"De ºC (Celsius) a K (Kelvin)", 
				"De ºF (Fahrenheit) a ºC (Celsius)", 
				"De ºF (Fahrenheit) a K (Kelvin)", 
				"De K (Kelvin) a KRW ºC (Celsius)", 
				"De K (Kelvin) a MXN ºF (Fahrenheit)"
				};
		
		return JOptionPane.showInputDialog(null, 
				"Elije la conversión de temperatura que deseas", 
				"Temperaturas", 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				temperatureConversionOptions, 
				temperatureConversionOptions[0]
				);
	}

	public static Object showAmountOfMoney() {
		/*Cantidad de Dinero*/
		return JOptionPane.showInputDialog(null, 
				"Ingresa la cantidad de dinero que deseas convertir:", 
				"Cantidad de Dinero", 
				JOptionPane.QUESTION_MESSAGE 
				);
	}

	public static void showConversionValue(String conversionValue) {
		/*Resultado de Conversion*/
		JOptionPane.showMessageDialog(null, 
				"Tienes $ " + conversionValue + " Dolares", 
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
