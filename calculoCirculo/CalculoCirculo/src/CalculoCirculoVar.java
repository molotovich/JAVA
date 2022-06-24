
/*Importamos Libreria Scanner para poder leer los datos que introducirá el usuario */
import java.util.Scanner;

public class CalculoCirculoVar {
	public static void main(String[] args) {
		// creacion del objeto scanner para la lectura
		Scanner in = new Scanner(System.in);
		/*
		 * Este programa calcula el área de un circulo, las variables double son numeros
		 * y String son letras
		 */
		double pi;
		double radioc;
		/* Con esta variable capturamos la entrada del usuario */
		String radio;
		System.out.println("Escribe el valor para Radio");
		radio = in.nextLine(); // capturamos el número
		System.out.println("Pi siempre vale 3.1416");
		pi = 3.1416;
		/* Aqui convertimos el string radio a double con Double.parseDouble(s) */
		radioc = Math.pow(Double.parseDouble(radio), 2);
		/* Elevamos al cuadrado el radio */
		System.out.println("El área del circulo es " + pi * radioc + " centimetros cuadrados");
		in.close();
	}

}
