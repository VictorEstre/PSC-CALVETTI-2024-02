import javax.swing.JOptionPane;
public class Ex6
{
   public static void main(String[] args)
   {
      //lendo os dados
      String sNumero = JOptionPane.showInputDialog(
      "Digite um numero de 03 casas decimais:");
     
      //convertendo para reais
      int numero = Integer.parseInt(sNumero);
      
      //calculando a dezena do numero
      int dezenas = (numero / 10) % 10;
      
      //apresentando o resultado
      JOptionPane.showMessageDialog(null, "O numero da dezena será " + dezenas);
   }
}