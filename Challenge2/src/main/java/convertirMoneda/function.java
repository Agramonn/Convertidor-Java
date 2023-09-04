package convertirMoneda;

import javax.swing.JOptionPane;

public class function {
	
	
public void convertirMonedas(double Minput) {
	
	convertirMoneda monedas = new convertirMoneda();
	
	Object[] operacion = {"Pesos A Dolar", "Peso A Euro","Peso A Libra"};
	
	String opcion = (JOptionPane.showInputDialog(null, "Elije la conversion que guste: ", "Monedas",JOptionPane.INFORMATION_MESSAGE, null ,operacion, operacion[0])).toString();
	
	switch (opcion) {
	case "Pesos A Dolar":
		monedas.convertirPesosADolares(Minput);
		
		break;

	default:
		break;
	}
}
}
