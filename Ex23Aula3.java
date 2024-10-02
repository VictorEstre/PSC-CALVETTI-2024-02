import javax.swing.JOptionPane;
public class Ex23Aula3
{
  public static void main(String[] args)
   {
         //lendo os dados
         int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos numeros pares deseja imprimir:"));
        
        // Inicializa a string para armazenar os números
        String resultado = "";

        // Imprime os números pares
        for (int i = 1; i <= quantidade; i++) {
            resultado += (i * 2) + ", "; 
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Números pares:\n" + resultado);
    }
}