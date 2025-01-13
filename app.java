import javax.swing.JOptionPane;

public class app{
    public static void main(String[] args) {
        
    String texto = JOptionPane.showInputDialog(null, "Digite um numero double:");
    double numero = Double.parseDouble(texto);
    JOptionPane.showMessageDialog(null, numero);
    }
}