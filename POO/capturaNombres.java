//importamos el scanner para la lectura
import java.util.Scanner;
public class capturaNombres {
	public static void main (String[]args){
	//creacion del objeto scanner para la lectura
	Scanner in=new Scanner(System.in);
	//declaramos variables string para la captura
	String nombre,apellido,direccion,tel,cp,edad;
	//realizamos la captura, usarmos nextline para capturar mas de una palabra, como en
	//apellidos y direccion
	System.out.print("Escribe el nombre ");
	nombre=in.next();
	System.out.print("Escribe los apellidos ");
	apellido=in.nextLine();
	System.out.print("Escribe la edad ");
	edad=in.next();
	System.out.print("Escribe la direccion ");
	direccion=in.nextLine();
	System.out.print("Escribe el codigo postal ");
	cp=in.next();
	System.out.print("Escribe el telefono ");
	tel=in.next();
	//cerramos el scanner
	in.close();
	//escribimos los datos capturados
	System.out.println(nombre+" "+apellido+" tiene "+edad+" años de edad");
	System.out.println("vive en "+direccion+" CP "+cp+" su telefono es "+tel);
}
}
