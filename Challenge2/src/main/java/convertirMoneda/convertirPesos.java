package convertirMoneda;

import javax.swing.JOptionPane;

public class convertirPesos {
	
	public void convertirDolaresAPesos(double valor) {
		double dolar = valor * 17.06;
		//Castear la variable dolar a double y reondearla
		dolar = (double) Math.round(dolar*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+dolar+" Pesos");
		
	}
	public void convertirEurosAPesos(double valor) {
		double euro = valor * 18.40 ;
		euro = (double) Math.round(euro*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+euro+" Pesos");
		
	}
	public void convertirLibrasAPesos(double valor) {
		double libras = valor * 21.50;
		libras = (double) Math.round(libras*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+libras+" Pesos");
		
	}
	public void convertirYenesAPesos(double valor) {
		double yenes = valor * 8.40 ;
		yenes = (double) Math.round(yenes*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+yenes+" Pesos");
		
	}
	public void convertirWonesAPesos(double valor) {
		double wones = valor * 75.90  ;
		wones = (double) Math.round(wones*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+wones+" Pesos");
		
	}
}

