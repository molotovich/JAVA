//importamos el scanner
import java.util.Scanner;
public class SumaMedia {
	public static void main (String[]args){
		//creamos el scanner para que lo use el programa
		Scanner in=new Scanner(System.in);
		//declaracion de variables
		int a,b,c,d,suma,media;
		//captura de variables
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		//cerramos el scanner al terminar de usarlo
		in.close();
		//ejecutamos las operaciones solicitadas
		suma=a+b+c+d; //suma de los 4 elementos
		media=suma/4; //la media de los 4 elementos
		//impresion de salida en pantalla
		System.out.println("La suma de a,b,c,d es "+suma);
		System.out.println("la media de a,b,c,d es "+media);
	}

}
