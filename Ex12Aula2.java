import javax.swing.JOptionPane;
public class Ex12Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   
   int numero = Integer.parseInt(sNumero);
   
   
   //Conferindo se e divisivel por 3 e 7
   boolean numeropor2 = (numero % 2 == 0);
   boolean numeropor5 = (numero % 5 == 0);
   boolean numeropor10 = (numero % 10 == 0);
   
           
   //testar a condicao e informar o resultado
      if (numeropor2 && numeropor5 && numeropor10) {
      JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 2, 5 e por 10 ");
      
     } else if (numeropor2) {
     JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 2 ");
     
     } else if (numeropor5) {
     JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 5 ");
     
     } else if (numeropor10) {
     JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 10 ");
     }
     else {
      JOptionPane.showMessageDialog(null, "O numero " + numero + " nao e divisivel por 2, por 5 e nem por 10");
     }
   }
}   