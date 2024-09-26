import javax.swing.JOptionPane;
public class Ex10Aula3
{
  public static void main(String[] args)
   {
   
    //ler os valores 
        String sNumero;
        int numero;

         // Testando loop
        while (true) {
        sNumero = JOptionPane.showInputDialog("Digite um numero (-999 para sair):");
        numero = Integer.parseInt(sNumero);
            
            if (numero == -999) {
            break;
            }

            String divisores = "Divisores de " + numero + ": ";
            for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
            divisores += i + ", ";
                }
            }
            //Imprimindo os dados
            
            JOptionPane.showMessageDialog(null, divisores);
        }
    }
}
         