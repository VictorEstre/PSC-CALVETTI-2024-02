import javax.swing.JOptionPane;
public class Ex09
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sNumero = JOptionPane.showInputDialog(
   "Digite um numero:");
   String sBase = JOptionPane.showInputDialog(
   "Digite a base para calcular esse numero:");
   
   
   //convertendo para reais
   double numero = Double.parseDouble(sNumero);   
   double base = Double.parseDouble(sBase); 
   
   double resultado = Math.pow(numero, base);
       
      
  JOptionPane.showMessageDialog(null, "O resultado do numero elevado a base sera: " + resultado);
   }
}