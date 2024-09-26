import javax.swing.JOptionPane;
public class Ex11Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   
   int numero = Integer.parseInt(sNumero);
   
   
   //Conferindo se e divisivel por 3 e 7
   boolean numeropor3 = (numero % 3 == 0);
   boolean numeropor7 = (numero % 7 == 0);
   
           
   //testar a condicao e informar o resultado
      if (numeropor3 && numeropor7){
      JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 3 e por 7 ");
      
     } else if (numeropor3) {
     JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 3, mas nao por 7 ");
     
     } else if (numeropor7) {
     JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 7, mas nao por 3"); 
     }
     else {
      JOptionPane.showMessageDialog(null, "O numero " + numero + " nao e divisivel por 3 e nem por 7");
     }
   }
}   