import javax.swing.JOptionPane;
public class Ex1Aula2
{
  public static void main(String[] args)
   {
   //ler os valores 
   String sNumero1 = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   String sNumero2 = JOptionPane.showInputDialog(
   "Digite um numero inteiro: ");
   
   //converter para inteiro
   int numero1 = Integer.parseInt(sNumero1);
   int numero2 = Integer.parseInt(sNumero2);
  
    
   //calcular soma dos numeros
      int soma = numero1 + numero2;
      
   //testar a condicao e informar o resultado
   if(soma > 10){
      System.out.println("A soma sera maior que 10, entao mostraremos o numero:" + soma);
      //System.out.println("Emprestimo negado.");
   } else {
      System.out.println("A soma nao atingiu o resultado 10.");   
      }
   }
}   
   
 