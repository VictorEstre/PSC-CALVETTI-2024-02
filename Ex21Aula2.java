import javax.swing.JOptionPane;
public class Ex21Aula2
{
  public static void main(String[] args)
   {
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String sNumero3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        
        // Convertendo as entradas para inteiros
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);
        int numero3 = Integer.parseInt(sNumero3);
        
        int maior;

        // Determinando o maior número
        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }
        
        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}