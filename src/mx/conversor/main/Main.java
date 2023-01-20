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
				
				System.out.println("A");
				
			}else if(converter.toString() == "Conversor de Temperatura") {
				System.out.println("B");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
