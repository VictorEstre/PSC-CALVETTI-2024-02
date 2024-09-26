import javax.swing.JOptionPane;
public class Ex07Aula3
{
  public static void main(String[] args)
   {
   
   int numero = 1; 
   
        System.out.println("Numeros multiplos de 5 entre 1 e 500:");
        
         // Testando loop
        while (numero <= 500) {
        if (numero % 5 == 0) {
        System.out.println(numero); 
        }
        numero++; 
        }
    }
}   