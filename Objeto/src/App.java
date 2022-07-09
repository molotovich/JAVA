import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Persona juan=new Persona();
        juan.direccion="Mexico";
        juan.edad=17;
        juan.nombre="Juan Carlos Gomez";
        juan.sexo='h';
        juan.email="juan.gomez@correo.com";
        
        Persona pedro=new Persona();
        System.out.println("Coloque el nombre para la siguiente persona");
        pedro.nombre=in.nextLine();
        System.out.println("Coloque la dirección para la siguiente persona");
        pedro.direccion=in.nextLine();

        System.out.println(juan.direccion);
        System.out.println(juan.edad);
        System.out.println(juan.nombre);
        System.out.println(juan.sexo);
        System.out.println(juan.email);

        System.out.println(pedro.nombre);
        System.out.println(pedro.direccion);




    }
}
