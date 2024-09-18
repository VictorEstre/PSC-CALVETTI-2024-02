import javax.swing.JOptionPane;
public class Ex01IntAtr
{
   public static void main(String[] args)
   {
      //lendo os dados
                 
      String sNome = JOptionPane.showInputDialog(
      "Digite seu primeiro nome:");
      String sSobrenome = JOptionPane.showInputDialog(
      "Digite seu segundo nome:");
      String sUltimoNome = JOptionPane.showInputDialog(
      "Digite seu ultimo nome:");
      
      String nome = sNome;
      String sobrenome = sSobrenome;
      String ultimonome = sUltimoNome;
            
      //apresentando o resultado  
      JOptionPane.showMessageDialog(null, ultimonome + " " + sobrenome + " " + nome);
       
   }
}