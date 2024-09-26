import javax.swing.JOptionPane;
public class Ex23Aula2
{
  public static void main(String[] args)
   {
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo numero:");
        String sNumero3 = JOptionPane.showInputDialog("Digite o terceiro numero:");

        // Convertendo as entradas para inteiros
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);
        int numero3 = Integer.parseInt(sNumero3);

        int maior, intermediario, menor;

        // Determinando a ordem
        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
            if (numero2 >= numero3) {
                intermediario = numero2;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero2;
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
            if (numero1 >= numero3) {
                intermediario = numero1;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 >= numero2) {
                intermediario = numero1;
                menor = numero2;
            } else {
                intermediario = numero2;
                menor = numero1;
            }
        }

        // Exibindo o resultado
        String resultado = "Maior: " + maior + "\nIntermediário: " + intermediario + "\nMenor: " + menor;
        JOptionPane.showMessageDialog(null, resultado);
    }
}