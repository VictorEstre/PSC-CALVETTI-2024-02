import javax.swing.JOptionPane;
public class Ex22Aula2
{
  public static void main(String[] args)
   {
    int maior = Integer.MIN_VALUE; 
        int contador = 0; 

        while (contador < 3) {
            String input = JOptionPane.showInputDialog("Digite o numero " + (contador + 1) + ":");
            int numero;

            try {
                numero = Integer.parseInt(input); 
               
                if (numero > maior) {
                    maior = numero;
                }

                contador++; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida. Por favor, insira um número.");
            }
        }

        // Exibe o maior número
        JOptionPane.showMessageDialog(null, "O maior numero é: " + maior);
    }
}