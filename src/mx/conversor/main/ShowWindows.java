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
}
