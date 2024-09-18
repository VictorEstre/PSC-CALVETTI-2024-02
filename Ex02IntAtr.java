import javax.swing.JOptionPane;
public class Ex02IntAtr
{
   public static void main(String[] args)
   {
      //lendo os dados
         String sNumero = JOptionPane.showInputDialog(
         "Digite um numero inteiro:"); 
         
         //convertendo para reais 
         int x = Integer.parseInt(sNumero);       
            
         //apresentando o resultado
            
      JOptionPane.showMessageDialog(null, "O valor do numero digitado e: " + x);
       
   }
}