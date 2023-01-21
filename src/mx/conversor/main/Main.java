package mx.conversor.main;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import mx.conversor.model.Currencies;
import mx.conversor.model.Temperatures;

public class Main {

	public static void main(String[] args) {
		try {
			boolean closeProgram = false;
			
			Object conversion = null;
			double inputNumber = 0;
			boolean inputNumberValid = false;
			Object responseInputNumber = null;
			
			Object converter = ShowWindows.showMainMenu();
			
			if(converter != null) { 
				
				if(converter.toString() == "Conversor de Moneda") {
					
					while(!closeProgram) {
						
						conversion = ShowWindows.showConversion("currency", "Monedas", "Elije la moneda a la que deseas convertir tu dinero");
						if(conversion == null) 
							break;
						
						while(!inputNumberValid) {
							
							responseInputNumber = ShowWindows.showInputNumber("Cantidad de Dinero", "Ingresa la cantidad de dinero que deseas convertir: "); 
							if(responseInputNumber == null) {
								inputNumberValid = false;
								break;
							}

							if(responseInputNumber.toString().matches("[0-9.]+")) {
								inputNumber = Double.valueOf(responseInputNumber.toString());
								inputNumberValid = true;
							}else {
								ShowWindows.showError("Por favor ingresa un numero valido.");
							}
						}
						if(!inputNumberValid)
							break;
					}
					
				}else if(converter.toString() == "Conversor de Temperatura") {
					
					while(!closeProgram) {
						
						conversion = ShowWindows.showConversion("temperature", "Temperaturas", "Elige la conversión de temperatura que deseas");
						if(conversion == null) 
							break;
						
						while(!inputNumberValid) {
							
							responseInputNumber = ShowWindows.showInputNumber("Numero de Grados", "Ingresa el numero de grados que deseas convertir: "); 
							if(responseInputNumber == null) {
								inputNumberValid = false;
								break;
							}

							if(responseInputNumber.toString().matches("[0-9.]+")) {
								inputNumber = Double.valueOf(responseInputNumber.toString());
								inputNumberValid = true;
							}else {
								ShowWindows.showError("Por favor ingresa un numero de grados valido.");
							}
						}
						if(!inputNumberValid)
							break;
					}
					
				}
				
			}
			
			ShowWindows.showCloseProgram();
			
			
			
			/*
				
				
					
					
						/*Obtención y Validacion de la Conversión
						
						
						/*Obtención y Validacion de la Cantidad a convertir
						
						
						
						DecimalFormat decimalFormat = new DecimalFormat("#.0000");
						ShowWindows.showConversionValue(decimalFormat.format(Currencies.convert(currencyConversion.toString(), amount)));
						
						Object closeProgramResponse = ShowWindows.showQuestionCloseProgram(); 
						if(Integer.valueOf(closeProgramResponse.toString()) != 0) {
							closeProgram = true;
						}
					}
					
				}
					
					while(!closeProgram) {
						/*Obtención y Validacion de la Conversión
						Object temperatureConversion = ShowWindows.showTemperatureConversion();
						if(temperatureConversion == null) 
							break;
						
						/*Obtención y Validacion de los grados de temperatura a convertir
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
			
			*/
			
		} catch (Exception e) {
			ShowWindows.showError("Ha ocurrido un error inesperado, por favor intente mas tarde.");
		}
	}
}
