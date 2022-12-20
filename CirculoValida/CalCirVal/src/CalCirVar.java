/*Importamos Libreria Scanner para poder leer los datos que introducirá el usuario */
import java.util.Scanner;

public class CalCirVar {
	public static void main(String[] args) {
		// creacion del objeto scanner para la lectura
		Scanner in = new Scanner(System.in);
		// Declaración de Variables
		//int a;
		Integer exp;
		double pi;
		double radioc;
		String radio;

		//radio=in.nextLine();
	//	exp = in.nextInt();
	
		Boolean bandera=true; //valor que usaremos para indicr a nuestro bucle que es hora de salir
		/*
		 * Este programa calcula el área de un circulo,
		 * pregunta el valor del radio y valida que sean numeros
		 */
		while (Boolean.TRUE.equals(bandera)) { //utilizamos el bucle DO {} WHILE (condición)
			System.out.println("Escribe el valor para Radio");
			radio = in.nextLine(); // Capturamos entrada de usuario
			if (radio.matches("\\d{1,5}")) { //usamos una expresión regular para validar el dato de entrada
				radioc = Double.parseDouble(radio); //convertimos de string a double
				pi = 3.1416; //asignamos valor a pi
				System.out.println("El área del circulo es " + pi * Math.pow(radioc,2) + " centimetros cuadrados");
				bandera = false;
			} else {
				System.out.println("Valor no valido, vuelva a intentar");
				bandera = true;
			}
			
		}
		
		in.close();
	}

}
