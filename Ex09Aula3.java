import javax.swing.JOptionPane;
public class Ex09Aula3
{
  public static void main(String[] args)
   {
   //ler os valores 
    int numero = 1;
    int soma = 0;
    
    // Testando loop
    
    while(numero <= 100){
    System.out.println(numero);
    soma += numero;
    numero++;}
    
    //Imprimindo os dados
    System.out.println("A soma de 1 a 100 e: " + soma);
     
   }
}   
   