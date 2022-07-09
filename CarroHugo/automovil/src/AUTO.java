import java.util.Scanner;
import misClases.Atributos;

public class AUTO {
  
    public static void main(String[] args)  {
        // METODO
    Scanner Ent=new Scanner(System.in);
    Atributos autonuevo = new Atributos("Audi");

    autonuevo.setAnio(Integer.parseInt(Ent.nextLine()));
    autonuevo.
    

        // ENTRADA DE DATOS
    System.out.println("Cual es la Marca del Auto " );
        Auto1.Marca = Ent.nextLine();
    System.out.println("Cual es el Año del Auto ");
        Auto1.Anio = Integer.parseInt(Ent.nextLine());
    System.out.println("Cual es el Color del Auto ");
        Auto1.Color = Ent.nextLine();
    System.out.println("Cual es el Kilometraje del Auto ");
        Auto1.Km = Ent.nextLine();

        Ent.close();
    
        // SALIDA DE DATOS
    System.out.println("La marca del primer auto es: "+ Auto1.Marca);  
    System.out.println("El año del auto es: "+ Auto1.Anio);
    System.out.println("El color del auto es: "+ Auto1.Color);
    System.out.println("El Km del auto es: "+ Auto1.Km);  
    }
}
