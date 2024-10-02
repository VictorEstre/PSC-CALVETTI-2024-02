import javax.swing.JOptionPane;
public class Ex22Aula3
{
  public static void main(String[] args)
   {
 
         int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser o limite superior de um intervalo:"));

        
        String resultado = " ";

        // testando a condição
        for (int i = 1; i < limite; i += 2) {
            resultado += i + " "; 
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Números ímpares menores que " + limite + ":\n" + resultado + ".");
    }
}