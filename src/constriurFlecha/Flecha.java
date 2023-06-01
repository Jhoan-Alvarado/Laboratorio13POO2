package constriurFlecha;
import javax.swing.JOptionPane;

public class Flecha {

	
	int longitud;
	String color;
	
			
	public void iniciar () {
		
		construirFlecha();
	}
	
	
	public Flecha () {
		
		longitud = pedirInt("Ingrese la longitud de la flecha");
		color = pedirString("Ingrese el color de la flecha");
		
	}


	private void construirFlecha() {
		for (int i = 0; i < longitud; i++) {
			
			imprime("-");
			
		}
		
		imprime(">");
	}
	
	



	private void imprime(String simbolo) {
		
		if (color.equals("negro"))
		{
			System.out.print(simbolo);
		}
		
		else if (color.equals("rojo"))
		{
			System.err.print(simbolo);
		}
	
		
	}


	private String pedirString(String mensaje) {
	String m = JOptionPane.showInputDialog(mensaje);
		return m;
	}

	
	private int pedirInt(String mensaje) {
		int longit;
		 do {
			 longit = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
			
		} while (longit < 1);
		return longit;
	}
	
	
}
