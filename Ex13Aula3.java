import javax.swing.JOptionPane;
public class Ex13Aula3
{
  public static void main(String[] args)
   {
   //ler os valores 
    String sNumero = JOptionPane.showInputDialog("Digite um numero:");
        int numero = Integer.parseInt(sNumero);
        
        // Testando loop
        boolean primo = true;
        if (numero < 2) {
            primo = false;
        } else {
         for (int i = 2; i <= Math.sqrt(numero); i++) {
         if (numero % i == 0) {
         primo = false;
                    break;
                }
            }
        }
      //Imprimindo os dados
        String resultado = primo ? numero + " e primo." : numero + " não e primo.";
        JOptionPane.showMessageDialog(null, resultado);
    }
}