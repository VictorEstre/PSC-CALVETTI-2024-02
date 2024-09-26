import javax.swing.JOptionPane;
public class Ex15Aula3
{
  public static void main(String[] args)
   {
   //ler os valores 
    int maior = Integer.MIN_VALUE;
        int numero;

      // Testando loop
        while (true) {
        String sNumero = JOptionPane.showInputDialog("Digite um numero (-9999 para sair):");
        numero = Integer.parseInt(sNumero);
            
            if (numero == -9999) {
            break;
            }

            if (numero > maior) {
            maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior numero digitado foi: " + maior);
        
        }
    }
}