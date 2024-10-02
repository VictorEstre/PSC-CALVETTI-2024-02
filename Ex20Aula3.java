import javax.swing.JOptionPane;
public class Ex20Aula3
{
  public static void main(String[] args)
   {
        String sLimiteSuperior = JOptionPane.showInputDialog("Digite um numero para ser o limite superior"); 
        String sIncremento = JOptionPane.showInputDialog("Digite um numero para ser o incremento"); 
        
        
        double limitesuperior = Double.parseDouble(sLimiteSuperior);
        double incremento = Double.parseDouble(sIncremento);
         
        JOptionPane.showMessageDialog(null,"Numeros no intervalo de 0 ate " + limitesuperior + ":");

        for (int i = 0; i <= limitesuperior; i += incremento) {
            JOptionPane.showMessageDialog(null,i + " ");
        }
    }
}