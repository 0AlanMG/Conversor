package mx.conversor.main;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			boolean closeProgram = false;
			
			while(!closeProgram) {
				
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
					
					DecimalFormat decimalFormat = new DecimalFormat("#.0000");
					
					double onemxntousd = 0.05299;
					double onemxntoeur = 0.04877;
					double onemxntogpb = 0.04278;
					double onemxntojpy = 6.86512;
					double onemxntokrw = 65.23340;
					
					double conversionValue = 0;
					

					switch (currencyConversion.toString()) {
					case "De MXN (Peso) a USD (Dolar)": {
						conversionValue = amount * onemxntousd;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes $" + decimalFormat.format(conversionValue) + " Dolares", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De MXN (Peso) a EUR (Euro)": {
						conversionValue = amount * onemxntoeur;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes €" + decimalFormat.format(conversionValue) + " Euros", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De MXN (Peso) a GBP (Libra Esterlina)": {
						conversionValue = amount * onemxntogpb;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes £" + decimalFormat.format(conversionValue) + " Libras Esterlinas", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De MXN (Peso) a JPY (Yen Japonés)": {
						conversionValue = amount * onemxntojpy;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes ¥" + decimalFormat.format(conversionValue) + " Yenes", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De MXN (Peso) a KRW (Won Surcoreano)": {
						conversionValue = amount * onemxntokrw;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes ₩" + decimalFormat.format(conversionValue) + " Wones", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De USD (Dolar) a MXN (Peso)": {
						conversionValue = amount / onemxntousd;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes $" + decimalFormat.format(conversionValue) + " Pesos", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De EUR (Euro) a MXN (Peso)": {
						conversionValue = amount / onemxntoeur;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes $" + decimalFormat.format(conversionValue) + " Pesos", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De GBP (Libra Esterlina) a MXN (Peso)": {
						conversionValue = amount / onemxntogpb;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes $" + decimalFormat.format(conversionValue) + " Pesos", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De JPY (Yen Japonés) a MXN (Peso)": {
						conversionValue = amount / onemxntojpy;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes $" + decimalFormat.format(conversionValue) + " Pesos", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					case "De KRW (Won Surcoreano) a MXN (Peso)": {
						conversionValue = amount / onemxntokrw;
						
						JOptionPane.showMessageDialog(null, 
								"Tienes $" + decimalFormat.format(conversionValue) + " Pesos", 
								"Conversión", 
								JOptionPane.INFORMATION_MESSAGE
								);
						break;
					}
					default:
						break;
					}
					
					Object response = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if(Integer.valueOf(response.toString()) > 0) {
						closeProgram = true;
					}
					
				}else if(converter.toString() == "Conversor de Temperatura") {
					System.out.println("B");
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
			/*Error*/
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado, por favor intente mas tarde.", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}
}
