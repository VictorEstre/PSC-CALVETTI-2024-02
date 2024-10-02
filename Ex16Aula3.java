import javax.swing.JOptionPane;
public class Ex16Aula3
{
  public static void main(String[] args)
   {
   
    //ler os valores 
         String sNumero = JOptionPane.showInputDialog("Digite um numero para ser apresentado dentro da sequencia de Fibonacci");
         int numero = Integer.parseInt(sNumero);
         int x1 = 0;
         int x2 = 1;
         int contador = 1;
         int resultado = 1;

        //Testando o resultado
        while (contador < numero) {
               resultado = x1 + x2; 
               x1 = x2;
               x2 = resultado;
               contador++;
            
        }
        
        // Exibe a sequência na tela
        JOptionPane.showMessageDialog(null, "O numero desejado, na sequência de Fibonacci sera: " + resultado);
    }
}