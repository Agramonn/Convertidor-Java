package convertirTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	public void convertirTemperaturas(Double Miinput){
		
		convertirTemperatura temperatura = new convertirTemperatura();
		
		Object[] Conversiones = {"Celcius A Fahrenheit",
								 "Fahrenheit A Celcius",
								 "Kelvin A Celcius",
								 "Celcius A Kelvin",
								 "Fahrenheit A Kelvin",
								 "Kelvin A Fahrenheit"};
		String Opcion=(JOptionPane.showInputDialog(null,"Elije la conversion que guste","Temperatura",JOptionPane.INFORMATION_MESSAGE,null, Conversiones, Conversiones[0])).toString();
	
		switch (Opcion) {
		case "Celcius A Fahrenheit":
			temperatura.convertirCelciusAFarenheit(Miinput);
			break;
		case "Fahrenheit A Celcius":
			temperatura.convertirFarenheitACelcius(Miinput);
			break;
		case "Kelvin A Celcius":
			temperatura.convertirKelvinACelcius(Miinput);
			break;
		case "Fahrenheit A Kelvin":
			temperatura.convertirFarenheitAKelvin(Miinput);
			break;
		case "Celcius A Kelvin":
			temperatura.convertirCelciusAKelvin(Miinput);
			break;
		case "Kelvin A Fahrenheit":
			temperatura.convertirKelvinAFarenheit(Miinput);
			break;
		}
	}
}
