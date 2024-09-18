import javax.swing.JOptionPane;
public class Ex06IntAtr
{
   public static void main(String[] args)
   {
      //lendo os dados
                 
      char sMilhar = JOptionPane.showInputDialog(
         "Escreva um caractere numerico para ser sua milhar:").charAt(0);
      char sCentena = JOptionPane.showInputDialog(
         "Escreve um caractere numerico para ser sua centena:").charAt(0);
      char sDezena = JOptionPane.showInputDialog(
         "Escreva um caractere numerico para ser sua dezena:").charAt(0);
      char sUnidade = JOptionPane.showInputDialog(
         "Escreva um caractere numerico para ser sua unidade:").charAt(0);
     
      
      //apresentando o resultado
            
      JOptionPane.showMessageDialog(null, "Seu numero será: " + sMilhar + sCentena + sDezena +  sUnidade);
       
   }
}