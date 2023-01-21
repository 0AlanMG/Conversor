package mx.conversor.main;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import mx.conversor.model.Currencies;

public class Main {

	public static void main(String[] args) {
		try {
			
			boolean closeProgram = false;
			while(!closeProgram) {
				
				Object converter = ShowWindows.showMainMenu(); 
				
				if(converter == null)
					break;
				
				if(converter.toString() == "Conversor de Moneda") {
					
					/*Obtención y Validacion de la Conversión*/
					Object currencyConversion = ShowWindows.showCurrencyConversion();
					
					if(currencyConversion == null) 
						break;

					/*Obtención y Validacion de la Cantidad a convertir*/
					double amount = 0;
					boolean amountValid = false;
					while(!amountValid) {
						
						Object responseAmount = ShowWindows.showAmountOfMoney(); 
						
						if(responseAmount == null) {
							amountValid = false;
							break;
						}

						if(responseAmount.toString().matches("[0-9.]+")) {
							amount = Double.valueOf(responseAmount.toString());
							amountValid = true;
						}else {
							ShowWindows.showError("Por favor ingrese un numero valido.");
						}
					}
					if(!amountValid)
						break;
					
					DecimalFormat decimalFormat = new DecimalFormat("#.0000");
					ShowWindows.showConversionValue(decimalFormat.format(Currencies.convert(currencyConversion.toString(), amount)));
					
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
			ShowWindows.showError("Ha ocurrido un error inesperado, por favor intente mas tarde.");
		}
	}
}
