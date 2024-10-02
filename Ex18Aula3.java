import javax.swing.JOptionPane;
public class Ex18Aula3
{
  public static void main(String[] args)
   {
        String sLimiteInferior = JOptionPane.showInputDialog("Digite um numero para ser o limite inferior"); 
        String sLimiteSuperior = JOptionPane.showInputDialog("Digite um numero para ser o limite superior"); 
        String sIncremento = JOptionPane.showInputDialog("Digite um numero para ser o incremento"); 
        
        double limiteinferior = Double.parseDouble(sLimiteInferior);
        double limitesuperior = Double.parseDouble(sLimiteSuperior);
        double incremento = Double.parseDouble(sIncremento);
         
        System.out.println("Celsius\t\tFahrenheit");
        

        for (double celsius = limiteinferior; celsius <= limitesuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f\t\t%.2f%n", celsius, fahrenheit);
        }
    }
}