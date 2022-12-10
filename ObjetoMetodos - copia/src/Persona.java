import java.util.Scanner;

public class Persona {
	String nombre;
	String direccion;
	String edad;
	String sexo;
	String email;
	Scanner in = new Scanner(System.in);

	//inician metodos publicos
	public void capturaNombre() {
		System.out.println("Introduce el nombre completo de la persona");
		this.nombre = in.nextLine();
	}

	private void capturaDireccion() {
		System.out.println("Introduce la dirección");
		this.direccion = in.nextLine();
	}

	private void capturaSexo() {
		System.out.println("Introduce el Sexo de la persona");
		this.sexo = in.nextLine();
	}

	private void capturaEdad() {
		System.out.println("Introduce la Edad de la persona");
		this.edad = in.nextLine();
	}

	public void capturaEmail() {
		System.out.println("Introduce el Email de la persona");
		this.email = in.nextLine();
	}

	public void capturaTotal() {
		this.capturaNombre();
        this.capturaDireccion();
        this.capturaSexo();
        this.capturaEdad();
        this.capturaEmail();
	}
	
	public void imprimePersona() {
		System.out.println("Aqui van los datos de " +this.nombre);
        System.out.println("nombre: "+this.nombre);
        System.out.println("dirección "+this.direccion);
        System.out.println("sexo: " +this.sexo);
        System.out.println("edad: "+this.edad);
        System.out.println("correo electrónico: "+this.email);
	}

}