import javax.swing.JOptionPane;
public class CalcularAreaCirculo {
    public static void main(String[] args) throws Exception {

        // Asisgnar variables
        Double pi;
        Double area;
        Double radio;
        pi = 3.1416;

        // calcular el area
        radio = Double.parseDouble(JOptionPane.showInputDialog("dame el radio"));
        radio = Math.pow(radio, 2);
        area = pi * radio;

        // Imprimir
        JOptionPane.showMessageDialog(null, "El area es " + area + " c2");
    }
}
