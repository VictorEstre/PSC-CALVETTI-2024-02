import javax.swing.JOptionPane;
public class Ex4Aula2
{
  public static void main(String[] args)
   {
   // Lê os três números
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo numero:");
        String sNumero3 = JOptionPane.showInputDialog("Digite o terceiro numero:");

        // Converte as entradas para inteiros
        int A = Integer.parseInt(sNumero1);
        int B = Integer.parseInt(sNumero2);
        int C = Integer.parseInt(sNumero3);

        // Criando as variaveis
        int primeiro, segundo, terceiro;

        // Testando
        if (A <= B && A <= C) {
        primeiro = A;
        if (B <= C) {
        segundo = B;
        terceiro = C;
        } else {
        segundo = C;
        terceiro = B;
        }
        } else if (B <= A && B <= C) {
        primeiro = B;
        if (A <= C) {
        segundo = A;
        terceiro = C;
        } else {
        segundo = C;
        terceiro = A;
            }
        } else {
         primeiro = C;
         if (A <= B) {
         segundo = A;
         terceiro = B;
         } else {
         segundo = B;
         terceiro = A;
            }
        }

        // Exibe os números em ordem crescente
        JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente sera: " + primeiro + ", " + segundo + ", " + terceiro);
    }
}