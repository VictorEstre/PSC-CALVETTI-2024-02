import javax.swing.JOptionPane;
public class Ex19Aula3
{
  public static void main(String[] args)
   {
   
    //ler os valores 
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para calcular o fatorial:"));  
       
        long fatorial = 1;

        // Calcula o fatorial
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " é: " + fatorial);
    }
}