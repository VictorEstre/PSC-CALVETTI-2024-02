import javax.swing.JOptionPane;
public class Ex03
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sX = JOptionPane.showInputDialog(
   "Digite o número desejado:");
  
   //convertendo para reais
   double X = Double.parseDouble(sX);
   //calculando a exponenciação
   X = Math.pow(X, 2);
      //apresentando o resultado
   JOptionPane.showMessageDialog(null, "O resultado do numero escolhido elevado ao quadrado será " + X);
   }
}



// ver porque o numero está dando double e nao int