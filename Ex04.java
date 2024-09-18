import javax.swing.JOptionPane;
   public class Ex04
{
      public static void main(String[] args)
   {
   //lendo os dados
   String frase1 = JOptionPane.showInputDialog(
   "Digite digite seu nome:");
   String frase2 = JOptionPane.showInputDialog(
   "Digite seu segundo nome:");
   String frase3 = JOptionPane.showInputDialog(
   "Digite seu terceiro nome:");
   
       
   //Somando o comprimento das strings
   int comprimento = frase1.length() + frase2.length() + frase3.length();
   
   
   //apresentando o resultado
   JOptionPane.showMessageDialog(null, "A soma do comprimento das Strings será: " + comprimento );
   }
}   
   