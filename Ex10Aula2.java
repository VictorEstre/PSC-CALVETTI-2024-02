import javax.swing.JOptionPane;
public class Ex10Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   
   
   //converter para inteiro
   int numero = Integer.parseInt(sNumero);
   
           
   //testar a condicao e informar o resultado
   if(numero %5 == 0){
      JOptionPane.showMessageDialog(null, "O numero e multiplo de 5 ");
      }
     
     else {
      JOptionPane.showMessageDialog(null, "O numero nao e multiplo de 5");
     }
   }
}   
   