import javax.swing.JOptionPane;
public class Ex11
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sNascimento = JOptionPane.showInputDialog(
   "Digite sua data de nascimento no formato ddmmaa:");
   
      
   //convertendo para dia, mês e ano separado
   String dias = sNascimento.substring(0,2);
   String meses = sNascimento.substring(2,4);
   String anos = sNascimento.substring(4,6);    
      
   JOptionPane.showMessageDialog(null, "O dia do nascimento sera: " + dias);
   JOptionPane.showMessageDialog(null, "O mes do nascimento sera: " + meses);
   JOptionPane.showMessageDialog(null, "O ano do nascimento sera: " + anos);
   }
}