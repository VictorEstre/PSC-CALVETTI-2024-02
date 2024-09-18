import javax.swing.JOptionPane;
public class Ex02
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sAltura = JOptionPane.showInputDialog(
   "Digite a altura do seu triangulo:");
   String sBase = JOptionPane.showInputDialog(
   "Digite a base do seu triangulo:");
   //convertendo para reais
   int altura = Integer.parseInt(sAltura);
   int base = Integer.parseInt(sBase);
   //calculando a área
   int area = (base * altura);
   //apresentando o resultado
   JOptionPane.showMessageDialog(null, "A area deste triangulo representa " + area);
   }
}