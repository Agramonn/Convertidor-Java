package convertirMoneda;

import javax.swing.JOptionPane;

public class convertirMoneda {
	
	public void convertirPesosADolares(double valor) {
		double dolar = valor / 17.06;
		//Castear la variable dolar a double y reondearla
		dolar = (double) Math.round(dolar*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+dolar+" dolares");
		
	}
	public void convertirPesosAEuros(double valor) {
		double euro = valor / 18.40 ;
		euro = (double) Math.round(euro*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+euro+" Euros");
		
	}
	public void convertirPesosALibras(double valor) {
		double libras = valor / 21.50;
		libras = (double) Math.round(libras*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+libras+" Libras");
		
	}
	public void convertirPesosAYenes(double valor) {
		double yenes = valor / 8.40 ;
		yenes = (double) Math.round(yenes*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+yenes+" Yenes Japoneses");
		
	}
	public void convertirPesosAWones(double valor) {
		double wones = valor / 75.90  ;
		wones = (double) Math.round(wones*100d)/100;
		JOptionPane.showMessageDialog(null,"Son $"+wones+" Wones");
		
	}
}
