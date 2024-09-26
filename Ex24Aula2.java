import javax.swing.JOptionPane;
public class Ex24Aula2
{
  public static void main(String[] args)
   {
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 
        int contador = 0; 

        while (contador < 5) {
            String input = JOptionPane.showInputDialog("Digite o número " + (contador + 1) + ":");
            int numero;

            try {
                numero = Integer.parseInt(input); 
                
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

                contador++; 
           } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
            }
        }

        // Exibe o maior e o menor número
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
    }
}