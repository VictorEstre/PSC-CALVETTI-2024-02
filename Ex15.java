import javax.swing.JOptionPane;
public class Ex15
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sDividendo = JOptionPane.showInputDialog(
   "Digite um numero qualquer para ser o dividendo:");
   String sDivisor = JOptionPane.showInputDialog(
   "Digite um numero qualquer para ser divisor:");
   
   
   //convertendo para reais
   int dividendo = Integer.parseInt(sDividendo);
   int divisor = Integer.parseInt(sDivisor);
   
   
   //calculando quociente e resto
   int quociente = (dividendo / divisor);
   int resto = dividendo % divisor;
   
   //apresentando o resultado
   JOptionPane.showMessageDialog(null, "O quociente sera: " + quociente);
   JOptionPane.showMessageDialog(null, "O resto sera: " + resto);
   
      
   }
}