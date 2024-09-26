import javax.swing.JOptionPane;
public class Ex13Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   
   int numero = Integer.parseInt(sNumero);
   
   
   //Conferindo se e par ou impar
   if (numero < 100 || numero > 999) {
      System.out.println("O numero nao atingiu 03 casas decimais");
      } else {
      int dezenas = (numero / 10) %10;
      
      if (dezenas % 2 == 0) {
      System.out.println("O numero da dezena e par");
      
      } else {
      System.out.println("O numero da dezena e impar");
      }
      
  
     }
   }
}   