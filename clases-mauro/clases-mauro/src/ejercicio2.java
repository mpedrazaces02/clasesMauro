//Entrada y salida de datos
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio2 {
	public static void main(String args[]) {
		/*
		 * Scanner leer = new Scanner(System.in);
		 * System.out.print("Ingrese su nombre: "); String nombre = leer.nextLine();
		 * System.out.println("Su nombre es: " + nombre);
		 * 
		 * System.out.print("Ingrese su edad: "); int edad = leer.nextInt();
		 * System.out.println("Su edad es: " + edad);
		 */

		//String nombre = JOptionPane.showInputDialog("Digite su nombre: ");
		//JOptionPane.showMessageDialog(null, nombre,"Nombre de usuario",JOptionPane.ERROR_MESSAGE);
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
		JOptionPane.showMessageDialog(null, "");
	}
}