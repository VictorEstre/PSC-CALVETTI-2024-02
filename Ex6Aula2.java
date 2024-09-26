import javax.swing.JOptionPane;
public class Ex6Aula2
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
   if (numero > 20){
      JOptionPane.showMessageDialog(null, "O numero digitado foi maior que 20: ");
      
   } else if (numero == 20){
     JOptionPane.showMessageDialog(null, "O numero digitado foi igual a 20: ");
     
    } else 
    JOptionPane.showMessageDialog(null, "O numero digitado foi menor que 20: ");   
      }
}   
   