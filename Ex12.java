import javax.swing.JOptionPane;
public class Ex12
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sDataNascimento = JOptionPane.showInputDialog(
   "Digite sua data de nascimento no formato dd/mm/aa:");
      
   
   //convertendo para dia, mês e ano separado
   String dia = sDataNascimento.substring(0,2);
   String mes = sDataNascimento.substring(3,5);
   String ano = sDataNascimento.substring(6,8);
   
   
   
      
   JOptionPane.showMessageDialog(null, "O dia do nascimento sera: " + dia);
   JOptionPane.showMessageDialog(null, "O mes do nascimento sera: " + mes);
   JOptionPane.showMessageDialog(null, "O ano do nascimento sera: " + ano);
   }
}