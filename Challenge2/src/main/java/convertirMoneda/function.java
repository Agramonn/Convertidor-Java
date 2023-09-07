package convertirMoneda;

import javax.swing.JOptionPane;

public class function {
	
	
public void convertirMonedas(double Minput) {
	
	convertirMoneda monedas = new convertirMoneda();
	convertirPesos pesos = new convertirPesos();
	
	Object[] operacion = {"Pesos A Dolar", 
							"Peso A Euro",
							"Peso A Libra", 
							"Peso A Yen", 
							"Peso A Won",
							"Dolar A Pesos",
							"Euro A Pesos",
							"Libras A Pesos",
							"Yen A Pesos",
							"Won A Pesos"};
	
	String opcion = (JOptionPane.showInputDialog(null, "Elije la conversion que guste: ", "Monedas",JOptionPane.INFORMATION_MESSAGE, null ,operacion, operacion[0])).toString();
	
	switch (opcion) {
	case "Pesos A Dolar":
		monedas.convertirPesosADolares(Minput);
		
		break;
	
	case "Peso A Euro":
		monedas.convertirPesosAEuros(Minput);
		
		break;
		
	case "Peso A Libra":
		monedas.convertirPesosALibras(Minput);
		
		break;
		
	case "Peso A Yen":
		monedas.convertirPesosAYenes(Minput);
		
		break;
		
	case "Peso A Won":
		monedas.convertirPesosAWones(Minput);
		
		break;
		
	case "Dolar A Pesos":
		pesos.convertirDolaresAPesos(Minput);
		
		break;
		
	case "Euro A Pesos":
		pesos.convertirEurosAPesos(Minput);
		
		break;
		
	case "Libras A Pesos":
		pesos.convertirLibrasAPesos(Minput);
		
		break;
		
	case "Yen A Pesos":
		pesos.convertirYenesAPesos(Minput);
		
		break;

	case "Won A Pesos":
		pesos.convertirWonesAPesos(Minput);
		
		break;
		
	}
}
}
