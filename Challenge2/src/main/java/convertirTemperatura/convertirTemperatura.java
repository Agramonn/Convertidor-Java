package convertirTemperatura;

import javax.swing.JOptionPane;

public class convertirTemperatura {
	
	public void convertirCelciusAFarenheit(double valor) {
		double Farenheit = valor*1.8+23;
		Farenheit =(double) Math.round(Farenheit*100d)/100;
		JOptionPane.showMessageDialog(null, "Son "+Farenheit+" grados Farenheit");
	}
	public void convertirFarenheitACelcius(double valor) {
		double Celcius = (valor-32)/1.8;
		Celcius = (double) Math.round(Celcius*100d)/100;
		JOptionPane.showMessageDialog(null, "Son "+Celcius+" grados Celcius");
	}
	public void convertirKelvinACelcius(double valor) {
		double Celcius = valor-273.15;
		Celcius = (double) Math.round(Celcius*100d)/100;
		JOptionPane.showMessageDialog(null, "Son "+Celcius+" grados Celcius");
	}
	public void convertirCelciusAKelvin(double valor) {
		double Kelvin = valor + 273.15;
		Kelvin = (double) Math.round(Kelvin*100d)/100;
		JOptionPane.showMessageDialog(null, "Son "+Kelvin+" grados Kelvin");
	}
	public void convertirFarenheitAKelvin(double valor) {
		double Kelvin = 5/9*(valor-32)+273.15;
		Kelvin = (double) Math.round(Kelvin*100d)/100;
		JOptionPane.showMessageDialog(null, "Son "+Kelvin+" grados Kelvin");
	}
	public void convertirKelvinAFarenheit(double valor) {
		double Farenheit = 1.8*(valor-273.15)+32;
		Farenheit = (double) Math.round(Farenheit*100d)/100;
		JOptionPane.showMessageDialog(null, "Son "+Farenheit+" grados Fahrenheit");
	}
}
