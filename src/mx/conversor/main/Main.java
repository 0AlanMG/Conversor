package mx.conversor.main;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			
			boolean closeProgram = false;
			while(!closeProgram) {
				
				Object converter = ShowWindows.showMainMenu(); 
				
				if(converter == null)
					break;
				
				if(converter.toString() == "Conversor de Moneda") {
					
					Object currencyConversion = ShowWindows.showCurrencyConversion();
					
					if(currencyConversion == null) 
						break;
					
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
					
					Object response = JOptionPane.showConfirmDialog(null, 
							"¿Desea continuar?", 
							"Selecione una opción", 
							JOptionPane.YES_NO_CANCEL_OPTION);
					
					if(Integer.valueOf(response.toString()) > 0) {
						closeProgram = true;
					}
					
				}else if(converter.toString() == "Conversor de Temperatura") {
					System.out.println("B");
				}
			}
			
			JOptionPane.showMessageDialog(null, 
					"Programa terminado", 
					"Mensaje", 
					JOptionPane.INFORMATION_MESSAGE
					);
			
		} catch (Exception e) {
			System.out.println(e);
			/*Error*/
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado, por favor intente mas tarde.", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}
}
