package misClases;

public class Atributos {
    private String Marca;
    private int Anio;
    private String Color;
    private int Km;

    public Atributos(String nuevaMarca) {
        Marca = nuevaMarca;
    }

    // Método para obtener la edad del animal
    public int getKm() {
        return Km;
    }

    // Método para establecer la edad del animal
    public void setAnio(int nuevoAnio) {
        Anio = nuevoAnio;
    }

    // Método para obtener el nombre del animal
    public String getMarca() {
        return Marca;
    }
}