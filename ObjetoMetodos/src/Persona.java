import java.util.Scanner;

public class Persona {
	String nombre;
	String direccion;
	byte edad;
	String sexo;
	String email;
	Scanner in = new Scanner(System.in);

	//inician metodos publicos
	public void capturaNombre() {
		System.out.println("Introduce el nombre completo de la persona");
		this.nombre = in.nextLine();
	}

	public void capturaDireccion() {
		System.out.println("Introduce la dirección");
		this.direccion = in.nextLine();
	}

	public void capturaSexo() {
		System.out.println("Introduce el Sexo de la persona");
		this.sexo = in.nextLine();
	}

	public void capturaEdad() {
		System.out.println("Introduce la Edad de la persona");
		this.edad = in.nextByte();
	}

	public void capturaEmail() {
		System.out.println("Introduce el Email de la persona");
		this.email = in.nextLine();
	}
	
}