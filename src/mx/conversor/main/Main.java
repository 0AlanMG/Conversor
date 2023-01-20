package mx.conversor.main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			
			/*Menu Principal*/
			Object[] converterOptions = { "Conversor de Moneda", "Conversor de Temperatura" };
			Object converter = JOptionPane.showInputDialog(null, 
					"Seleccione una opción de conversión", 
					"Menu", 
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					converterOptions, 
					converterOptions[0]
					);
			
			if(converter.toString() == "Conversor de Moneda") {
				
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
				Object currencyConversion = JOptionPane.showInputDialog(null, 
						"Elije la moneda a la que deseas convertir tu dinero", 
						"Monedas", 
						JOptionPane.QUESTION_MESSAGE, 
						null, 
						currencyConversionOptions, 
						currencyConversionOptions[0]
						);
				
				switch (currencyConversion.toString()) {
				case "De MXN (Peso) a USD (Dolar)": {
					System.out.println("De MXN A USD");
				}
				default:
					throw new IllegalArgumentException();
				}
				
			}else if(converter.toString() == "Conversor de Temperatura") {
				System.out.println("B");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
