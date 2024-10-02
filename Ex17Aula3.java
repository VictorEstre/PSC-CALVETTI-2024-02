import javax.swing.JOptionPane;
public class Ex17Aula3
{
  public static void main(String[] args)
   {
   //
        System.out.println("Polegadas e centimetros");
        
        for (int polegadas = 1; polegadas <= 20; polegadas++) {
            double centimetros = polegadas * 2.54;
            System.out.printf("%d\t\t%.2f%n", polegadas, centimetros);
        }
    }
}