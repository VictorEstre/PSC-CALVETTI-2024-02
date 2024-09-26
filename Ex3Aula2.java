import javax.swing.JOptionPane;
public class Ex3Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero inteiro, sendo que se positivo, o resultado sera a raiz quadrada e se for negativo, resultara o numero elevado a ele mesmo: ");
   
   
   //converter para inteiro
   int numero = Integer.parseInt(sNumero);
   int numeroelevado = numero * numero;
   
   JOptionPane.showMessageDialog(null, "O numero digitado foi " + numero);
   
   // testar numero
  if (numero >=0){
   JOptionPane.showMessageDialog(null, "A raiz quadrada do numero apresentado sera: " + Math.sqrt(numero));
   }
    
   if (numero < 0){
      JOptionPane.showMessageDialog(null, "O quadrado do numero sera: " + -numeroelevado);}         
      }
}   