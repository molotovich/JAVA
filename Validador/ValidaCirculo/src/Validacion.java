import java.util.Scanner;
//Elaborado por Isaac Bonfil Zetina
public class Validacion {
    public static void main(String[] args) {

        // Metodo de entrada
        Scanner sc = new Scanner(System.in);

        // Crear y Asignar variables
        Integer pi[5,5];
        Integer apuntador=0;
        pi[apuntador]=50;
        zeta=pi[5]+pi[3];

        // Solicitamos los caracteres
        System.out.println("Por favor ingrese el radio");

        // Creamos una variable donde se almacene nuestro cantidad para despues
        // convertirlo de
        // String a double
        String sradio = sc.nextLine();

        // Creamos una variable para inicializar el ciclo
        int index = 1;
        while (index == 1) {

            // Creamos una condicional para validad los caracteres que se ingresan
            // Si la variable recibe un string procede a ejecutar la oparacion
            if (sradio.matches("\\d{1,5}")) {
                Double radio = Double.parseDouble(sradio);
                radio = Math.pow(radio, 2);
                area = radio * pi;
                System.out.println("El area es " + area + " c2");

                // Break funciona para cerrar un ciclo
                break;

                // Si no, los caracteres no son validos se vuelve a preguntar
            } else {
                System.out.println("Por favor ingrese un caracter valido");
                sradio = sc.nextLine();

            }
        }
    }
}