import javax.swing.JOptionPane;
public class Ex10
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sFrase1 = JOptionPane.showInputDialog(
   "Digite uma frase :");
   String sFrase2 = JOptionPane.showInputDialog(
   "Digite uma frase:");
   String sFrase3 = JOptionPane.showInputDialog(
   "Digite uma  frase:");
      
 
   //lendo os dados
   String metadefrase1 = sFrase1.substring(0, sFrase1.length() / 2);
   String fimfrase1 = sFrase1.substring(sFrase1.length() / 2);
   String metadefrase2 = sFrase2.substring(0, sFrase2.length() / 2);
   String fimfrase2 = sFrase2.substring(sFrase2.length() / 2);
   String metadefrase3 = sFrase3.substring(0, sFrase3.length() / 2);
   String fimfrase3 = sFrase3.substring(sFrase3.length() / 2);
   
   
   
   JOptionPane.showMessageDialog(null, "A frase inicial era: " + sFrase1 + " " + sFrase2 + " " + sFrase3);        
   JOptionPane.showMessageDialog(null, "A frase embaralhada sera:"+ metadefrase2 + fimfrase3 + fimfrase2 + metadefrase1 + metadefrase3 + fimfrase1);
   
   System.out.println(sFrase1 + sFrase2 + sFrase3);
   System.out.println(metadefrase2 + fimfrase3 + fimfrase2 + metadefrase1 + metadefrase3 + fimfrase1);
  
   }
}