public class App {
    public static void main(String[] args) {
        Persona juan=new Persona();
        juan.capturaNombre();
        juan.capturaDireccion();
        juan.capturaSexo();
        juan.capturaEdad();
        juan.capturaEmail();
                
        System.out.println(juan.direccion);
        System.out.println(juan.edad);
        System.out.println(juan.nombre);
        System.out.println(juan.sexo);
        System.out.println(juan.email);
    }
}
