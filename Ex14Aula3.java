import javax.swing.JOptionPane;
public class Ex14Aula3
{
  public static void main(String[] args)
   {
   
    //ler os valores 
    int quantidadePrimos = 0;

        while (true) {
            String sNumero = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):");
            int numero = Integer.parseInt(sNumero);

            
            if (numero <= 0) {
                break; // Para o loop
            }

            // Verifica se o número e ou nao primo
            boolean ePrimo = true;
            if (numero < 2) {
                ePrimo = false; 
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        ePrimo = false; 
                        break; 
                    }
                }
            }

            if (ePrimo) {
                quantidadePrimos++;
            }
        }

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "Quantidade de números primos: " + quantidadePrimos);
    }
}