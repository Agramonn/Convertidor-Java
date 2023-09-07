import javax.swing.JOptionPane;
import convertirMoneda.function;
import convertirTemperatura.functionTemperatura;


public class Lunch {
	static function monedas = new function();
	static functionTemperatura temperatura = new functionTemperatura();
	
	public static void main(String[] args) {
		
		
		boolean flag = true;
		while(flag) {
		//Primero crear la interfaz grafica con la que va a interactuar el usuario
		Object[] operacion = {"Conversor De Monedas", "Conversor De Temperatura"};
		//Utilizamos la libreria Joptionpne para las interfazes y configuramos 
		Object seleccion = JOptionPane.showInputDialog(null, "Elije la opcion a elejir: ", "Menu",JOptionPane.INFORMATION_MESSAGE, null ,operacion, operacion[0]);
		
		String opcionSeleccionada = seleccion.toString();		

		switch (opcionSeleccionada) {
		case "Conversor De Monedas":
			String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos a convertir:");
			
			if(validarInput(input)) {
				double Minput = Double.parseDouble(input);
				monedas.convertirMonedas(Minput);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "Deseas Realizar otra operacion?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opcion...");
				} else {
					flag= false;
					JOptionPane.showMessageDialog(null, "Programa terminado...");
				}
			}
			
			
			break;
		case "Conversor De Temperatura":
			String input1 =JOptionPane.showInputDialog(null,"Ingresa la temperatura a convertir: ");
			
				if(validarInput(input1)) {
					double Tinput = Double.parseDouble(input1);
					temperatura.convertirTemperaturas(Tinput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra operacion?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion...");
					}else {
						flag=false;
						JOptionPane.showMessageDialog(null, "Programa terminado...");
					}
					
				}
			break;
				
		}
		}
	}
	
	public static boolean validarInput(String numero) {
		try {
			double x = Double.parseDouble(numero);
			if(x >= 0 || x<0);
				return true;
		
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}
	}
}

