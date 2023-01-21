package mx.conversor.main;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import mx.conversor.model.Currencies;
import mx.conversor.model.Temperatures;

public class Main {

	public static void main(String[] args) {
		try {
			boolean closeProgram = false;
			
			Object converter = ShowWindows.showMainMenu();
			
			if(converter != null) {
				
				if(converter.toString() == "Conversor de Moneda") {
					
					while(!closeProgram) {
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
						
						Object closeProgramResponse = ShowWindows.showQuestionCloseProgram(); 
						if(Integer.valueOf(closeProgramResponse.toString()) != 0) {
							closeProgram = true;
						}
					}
					
				}else if(converter.toString() == "Conversor de Temperatura") {
					
					while(!closeProgram) {
						/*Obtención y Validacion de la Conversión*/
						Object temperatureConversion = ShowWindows.showTemperatureConversion();
						if(temperatureConversion == null) 
							break;
						
						/*Obtención y Validacion de los grados de temperatura a convertir*/
						double degrees = 0;
						boolean degreesValid = false;
						while(!degreesValid) {
							
							Object responseDegrees = ShowWindows.showTemperatureDegree(); 
							if(responseDegrees == null) {
								degreesValid = false;
								break;
							}

							if(responseDegrees.toString().matches("[0-9.]+")) {
								degrees = Double.valueOf(responseDegrees.toString());
								degreesValid = true;
							}else {
								ShowWindows.showError("Por favor ingrese un numero de grados valido.");
							}
						}
						if(!degreesValid)
							break;
						
						DecimalFormat decimalFormat = new DecimalFormat("#.0000");
						ShowWindows.showConversionValue(decimalFormat.format(Temperatures.convert(temperatureConversion.toString(), degrees)));
						
						Object closeProgramResponse = ShowWindows.showQuestionCloseProgram(); 
						if(Integer.valueOf(closeProgramResponse.toString()) != 0) {
							closeProgram = true;
						}
					}
				}
			}
			
			ShowWindows.showCloseProgram();
			
		} catch (Exception e) {
			ShowWindows.showError("Ha ocurrido un error inesperado, por favor intente mas tarde.");
		}
	}
}
