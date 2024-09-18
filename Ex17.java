import javax.swing.JOptionPane;
public class Ex17
{
   public static void main(String[] args)
   {
      //lendo os dados
      
      //int base = 6;
      //int altura = 12;
      //int areatriangulo = (base * altura) / 2;
      
      String sBase = JOptionPane.showInputDialog(
      "Qual a base do triangulo:");
       String sAltura = JOptionPane.showInputDialog(
      "Qual a altura do triangulo:");
      
       int altura = Integer.parseInt(sAltura);
       int base = Integer.parseInt(sBase);
      
      //apresentando o resultado
      int area = (base * altura);
      
      JOptionPane.showMessageDialog(null, "A area deste triângulo será: " + area + "cm");
      
      //System.out.println(area);

   }
}