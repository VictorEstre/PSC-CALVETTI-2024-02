import javax.swing.JOptionPane;
public class Ex13
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sNumero1 = JOptionPane.showInputDialog(
   "Digite um numero inteiro:");
   String sNumero2 = JOptionPane.showInputDialog(
   "Digite um numero inteiro:");
   String sNumero3 = JOptionPane.showInputDialog(
   "Digite um numero inteiro:");
   
   
   //convertendo para reais
   int a = Integer.parseInt(sNumero1);
   int b = Integer.parseInt(sNumero2);
   int c = Integer.parseInt(sNumero3);
   
   int x = 2 * ((a-c) / 8) - b * 5;
   
   JOptionPane.showMessageDialog(null, "O resultado da equaçao sera:  " + x);
   }
}