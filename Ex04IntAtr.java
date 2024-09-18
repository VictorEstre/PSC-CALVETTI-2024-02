import javax.swing.JOptionPane;
public class Ex04IntAtr
{
   public static void main(String[] args)
   {
      //lendo os dados
                 
      String sPeso = JOptionPane.showInputDialog(
      "Qual seu peso em kg:");
    
       
       double peso = Double.parseDouble(sPeso);
      
      //apresentando o resultado
            
      JOptionPane.showMessageDialog(null, "O peso informado foi: " + peso + "kg");
       
   }
}