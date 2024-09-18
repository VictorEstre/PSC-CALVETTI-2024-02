import javax.swing.JOptionPane;
public class Ex08
{
   public static void main(String[] args)
   {
   
   //lendo os dados
   String sX = JOptionPane.showInputDialog(
   "Digite o número desejado:");
  
   //convertendo para reais
   double X = Double.parseDouble(sX);
   //calculando a exponenciação a base 10
   X = Math.pow(X, 10);
   
      //apresentando o resultado
   JOptionPane.showMessageDialog(null, "O resultado do numero escolhido elevado a 10 será " + X);
   }
}

  
