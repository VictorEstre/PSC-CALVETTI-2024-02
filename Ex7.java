import javax.swing.JOptionPane;
public class Ex7
{
   public static void main(String[] args)
   {
      //lendo os dados
      String sAngulo = JOptionPane.showInputDialog(
          "Digite um angulo em graus :");
          
      //calculando seno, cosseno, tangente, secante, cossecante e cotangente   
      double angulo = Double.parseDouble (sAngulo);
      double seno = Math.sin(angulo);
      double cosseno = Math.cos(angulo);
      double tangente = Math.tan(angulo);
      double secante = (1 / cosseno);
      double cossecante = (1 / seno);
      double cotangente = (1 / tangente);           
   
   //apresentando seno, cosseno e tangente
   JOptionPane.showMessageDialog(null, "O angulo sera: " + angulo);
   JOptionPane.showMessageDialog(null, "O seno sera: " + seno);
   JOptionPane.showMessageDialog(null, "O cosseno sera: " + cosseno);
   JOptionPane.showMessageDialog(null, "A tangente sera: " + tangente);
   JOptionPane.showMessageDialog(null, "A secante sera: " + secante);
   JOptionPane.showMessageDialog(null, "A cossecante sera: " + cossecante);
   JOptionPane.showMessageDialog(null, "A cotangente sera: " + cotangente);
   
      }
      
}     