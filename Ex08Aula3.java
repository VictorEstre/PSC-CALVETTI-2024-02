import javax.swing.JOptionPane;
public class Ex08Aula3
{
  public static void main(String[] args) {
        int contador = 0;
        int numero;

        String entrada;
        entrada = JOptionPane.showInputDialog("Digite um numero (ou 'zero' para finalizar):");

         // Testando loop
        while (entrada != null && !entrada.equalsIgnoreCase("zero")) {
            numero = Integer.parseInt(entrada);
            if (numero >= 120 && numero <= 300) {
                contador++;
            }
            entrada = JOptionPane.showInputDialog("Digite outro numero (ou 'zero' para finalizar):");
        }

      //Imprimindo os dados
        JOptionPane.showMessageDialog(null, "Voce digitou " + contador + " numeros entre 120 e 300.");
    }
}