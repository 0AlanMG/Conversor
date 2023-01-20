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
				
				double amount = 0;
				
				boolean valid = false;
				while(!valid) {
					
					/*Cantidad de Dinero*/
					Object amountObj = JOptionPane.showInputDialog(null, 
											"Ingresa la cantidad de dinero que deseas convertir:", 
											"Cantidad de Dinero", 
											JOptionPane.QUESTION_MESSAGE
										);
					
					if(amountObj.toString().matches("[0-9.]+")) {
						amount = Double.valueOf(amountObj.toString());
						valid = true;
					}else {
						/*Error*/
						JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido.", "Aviso", JOptionPane.ERROR_MESSAGE);
					}
				}

				switch (currencyConversion.toString()) {
				case "De MXN (Peso) a USD (Dolar)": {
					System.out.println("De MXN A USD " + amount);
				}
				default:
					throw new IllegalArgumentException();
				}
				
			}else if(converter.toString() == "Conversor de Temperatura") {
				System.out.println("B");
			}
			
		} catch (Exception e) {
			System.out.println(e);
			/*Error*/
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado, por favor intente mas tarde.", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}
}
