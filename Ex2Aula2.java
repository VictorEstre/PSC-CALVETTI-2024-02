import javax.swing.JOptionPane;
public class Ex2Aula2
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
      System.out.println("A soma sera: " + soma);
      
   //testar a condicao e informar o resultado
   if(soma <= 20){
      System.out.println("A soma do resultado subtraindo 5 sera:" + (soma - 5));
      
  } else {
     System.out.println("A soma ultrapassou o resultado desejado de 20.");   
      }
   }
}   
