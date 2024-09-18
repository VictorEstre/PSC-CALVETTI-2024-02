import javax.swing.JOptionPane;
public class Ex18
{
   public static void main(String[] args)
   {
      //lendo os dados
      
      //int diagonalmaior =96;
      //int diagonalmenor = 120;
     // int arealosango = (diagonalmaior + diagonalmenor) / 2;
     
     String sBase = JOptionPane.showInputDialog(
      "Qual a base do losango:");
       String sAltura = JOptionPane.showInputDialog(
      "Qual a altura do losango:");
      
       int altura = Integer.parseInt(sAltura);
       int base = Integer.parseInt(sBase);
      
      //apresentando o resultado
      int area = (base * altura) / 2;
      
      //apresentando o resultado
      
      JOptionPane.showMessageDialog(null, "A area deste triângulo será " + area + "cm");
      
      //System.out.println(arealosango);

   }
}