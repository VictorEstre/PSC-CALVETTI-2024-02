import javax.swing.JOptionPane;
public class Ex14
{
   public static void main(String[] args)
   {
   //lendo os dados
   String sRaio = JOptionPane.showInputDialog(
   "Digite o raio do circulo:");
   double PI = (3.14159);
   
      
   //convertendo para reais
   double raio = Integer.parseInt(sRaio);
   
      
   //calculando a area do circulo
   double area = (PI * raio * raio);
  
   //apresentando o resultado
   JOptionPane.showMessageDialog(null, area);
    
   
   }
}