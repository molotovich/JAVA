import java.util.Scanner;
// hecho por yesenia para la amteria de POO
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
		Double radio;
		System.out.println("Escribe el valor para Radio");
		radio = in.nextDouble(); // capturamos el número
		System.out.println("Pi siempre vale 3.1416");
		pi = 3.1416;
		/* Aqui convertimos el string radio a double con Double.parseDouble(s) */
		radioc = Math.pow(radio, 2);
		/* Elevamos al cuadrado el radio */
		//validacion de dato//
		//estructura iterativa Do-While//

        do {

			System.out.println("Escribe el valor para Radio");

			while (!in.hasNextInt())  {
				String CalculoCirculoVar = in.next();
				System.out.println("valor incorrecto, favor de ingresar un nuevo valor");
				System.out.println("Escribe el valor para Radio");
			}
			 //variable//
			 radio = in.nextDouble();
			 break;
			

		} while (true);

         //resultado/ respuesta//
		System.out.println("El área del circulo es " + pi * radioc + " centimetros cuadrados");
		in.close();
	}

}