import javax.swing.JOptionPane;
public class Ex20Aula2
{
  public static void main(String[] args)
   {

       // Lendo os dados
             
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));

        
        double menor, maior;

        // Identifica o menor e o maior número
        if (numero1 < numero2) {
        menor = numero1;
        maior = numero2;
        } else {
        menor = numero2;
        maior = numero1;
        }

        // Calcula e imprime os resultados
        double quadradoMenor = menor * menor;
        String resultado = "O quadrado do menor número (" + menor + ") é: " + quadradoMenor + ".\n";

        if (maior >= 0) {
        double raizMaior = Math.sqrt(maior);
        resultado += "A raiz quadrada do maior número (" + maior + ") é: " + raizMaior + ".";
        } else {
        resultado += "Não é possível calcular a raiz quadrada do maior número (" + maior + ").";
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}