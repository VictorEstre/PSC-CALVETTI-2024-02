import javax.swing.JOptionPane;
public class Ex15Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNascimento = JOptionPane.showInputDialog(
   "Digite seu ano de nascimento: ");
   
   
   int nascimento = Integer.parseInt(sNascimento);
   
   
   //Conferindo se a data de nascimento existe
   if (nascimento <= 0 ) {
      System.out.println("O ano inserido e invalido.");
      } else {
      System.out.println("O ano inserido e valido.");
      
      String sAno = JOptionPane.showInputDialog(
      "Digite o ano que estamos: ");
      
      
      int ano = Integer.parseInt(sAno);
         
      int idade = (ano - nascimento);
      
      JOptionPane.showMessageDialog(null, "Voce tem " + idade + " anos de vida");
  
     }
   }
}   