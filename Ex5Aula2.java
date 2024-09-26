import javax.swing.JOptionPane;
public class Ex5Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   
   
   //converter para inteiro
   int numero = Integer.parseInt(sNumero);
   
  
    System.out.println("O numero digitado foi:" + numero);
   
      
   //testar a condicao e informar o resultado
   if (numero >=20 && numero <91){
      JOptionPane.showMessageDialog(null, "Parabens! O numero digitado esta entre 20 e 90: ");
      
   } else {
      JOptionPane.showMessageDialog(null, "Ops! O numero digitado foi menor que 20 ou maior que 90: ");   
      }
   }
}   
   