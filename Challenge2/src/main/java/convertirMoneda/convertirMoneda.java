package convertirMoneda;

import javax.swing.JOptionPane;

public class convertirMoneda {
	
	public void convertirPesosADolares(double valor) {
		double dolar = valor * 17.06;
		//Castear la variable dolar a double y reondearla
		dolar = (double) Math.round(dolar);
		JOptionPane.showMessageDialog(null,"Son $"+dolar+" Dolares");
		
	}
	public void convertirPesosAEuros(double valor) {
		double euro = valor * 18.40 ;
		euro = (double) Math.round(euro);
		JOptionPane.showMessageDialog(null,"Son $"+euro+" Euros");
		
	}
	public void convertirPesosALibras(double valor) {
		double libras = valor * 21.50;
		libras = (double) Math.round(libras);
		JOptionPane.showMessageDialog(null,"Son $"+libras+" Euros");
		
	}
}
