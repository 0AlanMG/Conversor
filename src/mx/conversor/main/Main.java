package mx.conversor.main;

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
			Object inputNumberResponse = null;
			Object closeProgramResponse = null;
			
			
			Object converter = ShowWindows.showMainMenu();
			
			if(converter != null) { 
				
				if(converter.toString() == "Conversor de Moneda") {
					
					while(!closeProgram) {
						
						conversion = ShowWindows.showConversion("currency", "Monedas", "Elije la moneda a la que deseas convertir tu dinero");
						if(conversion == null) 
							break;
						
						while(!inputNumberValid) {
							
							inputNumberResponse = ShowWindows.showInputNumber("Cantidad de Dinero", "Ingresa la cantidad de dinero que deseas convertir: "); 
							if(inputNumberResponse == null) {
								inputNumberValid = false;
								break;
							}

							if(inputNumberResponse.toString().matches("[0-9.]+")) {
								inputNumber = Double.valueOf(inputNumberResponse.toString());
								inputNumberValid = true;
							}else {
								ShowWindows.showError("Por favor ingresa un numero valido.");
							}
						}
						if(!inputNumberValid)
							break;

						ShowWindows.showConversionValue(Currencies.convert(conversion.toString(), inputNumber));
						
						inputNumberValid = false;
						inputNumber = 0;
						
						closeProgramResponse = ShowWindows.showQuestionCloseProgram(); 
						if(Integer.valueOf(closeProgramResponse.toString()) != 0) {
							closeProgram = true;
						}
					}
					
				}else if(converter.toString() == "Conversor de Temperatura") {
					
					while(!closeProgram) {
						
						conversion = ShowWindows.showConversion("temperature", "Temperaturas", "Elige la conversión de temperatura que deseas");
						if(conversion == null) 
							break;
						
						while(!inputNumberValid) {
							
							inputNumberResponse = ShowWindows.showInputNumber("Numero de Grados", "Ingresa el numero de grados que deseas convertir: "); 
							if(inputNumberResponse == null) {
								inputNumberValid = false;
								break;
							}

							if(inputNumberResponse.toString().matches("[0-9.]+")) {
								inputNumber = Double.valueOf(inputNumberResponse.toString());
								inputNumberValid = true;
							}else {
								ShowWindows.showError("Por favor ingresa un numero de grados valido.");
							}
						}
						if(!inputNumberValid)
							break;
						
						ShowWindows.showConversionValue(Temperatures.convert(conversion.toString(), inputNumber));
						
						inputNumberValid = false;
						inputNumber = 0;
						
						closeProgramResponse = ShowWindows.showQuestionCloseProgram(); 
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
