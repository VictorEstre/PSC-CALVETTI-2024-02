import javax.swing.JOptionPane;
public class Ex03IntAtr
{
   public static void main(String[] args)
   {
      //lendo os dados
         String sdia = JOptionPane.showInputDialog(
         "Digite um dia do mês (dd):"); 
         String smes = JOptionPane.showInputDialog(
         "Digite um mes (m):"); 
         String sano = JOptionPane.showInputDialog(
         "Digite um ano (aaaa):"); 
         
         //convertendo para reais 
         int dia = Integer.parseInt(sdia);  
         int mes = Integer.parseInt(smes);   
         int ano = Integer.parseInt(sano);        
            
         //apresentando o resultado
            
      JOptionPane.showMessageDialog(null, "Sua data escolhida e:" + dia + "/" + mes + "/" + ano);
       
   }
}