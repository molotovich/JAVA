public class CalculoCirculo {
	public static void main(String[] args) {
		/*
		 * Este programa calcula el área de un circulo con un valor definido antes de
		 * compilarse
		 */
		double pi;
		double radio;
		pi = 3.1416;
		radio = Math.pow(6, 2);
		/* Math.pow(El valor a potenciar,la potencia) */
		/* Elevamos al cuadrado el radio */
		System.out.println("El área del circulo es " + pi * radio + " centimetros cuadrados");
	}

}
