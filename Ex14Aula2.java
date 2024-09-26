import javax.swing.JOptionPane;
public class Ex14Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero inteiro com 4 casas decimais: ");
   
   int numero = Integer.parseInt(sNumero);
   
   
   //Conferindo se esta entre 1000 e 9999
   if (numero < 1000 || numero > 9999) {
      System.out.println("O numero nao atingiu 04 casas decimais");
      } else {
      int centena = (numero / 100) % 100;
      int milhar = (numero / 1000) % 1000;
      
      int resultado = milhar + centena;
      
      if (resultado % 4 == 0) {
      System.out.println("O numero " + resultado + " e multiplo de 4");
      
      } else {
      System.out.println("O numero " + resultado + " nao e multiplo de 4");
      }
      
  
     }
   }
}   