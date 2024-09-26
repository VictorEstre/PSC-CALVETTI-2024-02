import javax.swing.JOptionPane;
public class Ex17Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero1 = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   String sNumero2 = JOptionPane.showInputDialog(
   "Digite um numero inteiro diferente do primeiro: ");
   
   //converter para inteiro
   int numero1 = Integer.parseInt(sNumero1);
   int numero2 = Integer.parseInt(sNumero2);
  
         
   //testar a condicao e informar o resultado
   if(numero1 < numero2){
      JOptionPane.showMessageDialog(null, "O numero menor e: " + numero1);
      }
   
     else {
      JOptionPane.showMessageDialog(null, "O numero menor e " + numero2);
     }
   }
}   
   
 