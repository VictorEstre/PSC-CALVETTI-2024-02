import javax.swing.JOptionPane;
public class Ex06Aula3
{
  public static void main(String[] args)
   {
   //ler os valores 
    double numero;
    
         // Testando loop
        while (true) {
        String sNumero = JOptionPane.showInputDialog("Digite um numero (-999 para encerrar):");
        numero = Double.parseDouble(sNumero);

            if (numero == -999) {
                break;
            }

            double raizQuadrada = Math.sqrt(numero);
            double inverso = 1.0 / numero;

            //Imprimindo os dados
            JOptionPane.showMessageDialog(null, "Número: " + numero + "\nRaiz Quadrada: " + raizQuadrada + "\nInverso: " + inverso);
        }
    }
}