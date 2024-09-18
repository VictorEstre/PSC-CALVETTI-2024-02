import javax.swing.JOptionPane;
public class Ex16
{
   public static void main(String[] args)
   {
      //lendo os dados
      String sNumero = JOptionPane.showInputDialog(
      "Digite um numero inteiro:");
     
            
      //convertendo para reais
      int numero = Integer.parseInt(sNumero);
      
      //apresentando o resultado      
      JOptionPane.showMessageDialog(null, " O numero escolhido e:" + numero);
      JOptionPane.showMessageDialog(null, " Sua raiz quadrada sera::" + Math.sqrt(numero));
      JOptionPane.showMessageDialog(null, " O numero elevado a ele mesmo sera:"+ Math.pow(numero, 2));
          
   }
}