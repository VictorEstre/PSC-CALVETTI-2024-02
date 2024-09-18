import javax.swing.JOptionPane;
public class Ex01
{
   public static void main(String[] args)
   {
      //lendo os dados
      String sIdade = JOptionPane.showInputDialog(
      "Quantos anos voce tem:");
     
      //convertendo para reais
      int idade = Integer.parseInt(sIdade);
      
      //calculando qantos dias uma pessoa com 31 anos viveu aproximadamente
      int dias = (idade * 365);
      //apresentando o resultado
      JOptionPane.showMessageDialog(null, "Você viveu aproximadamente " + dias + " dias conforme sua idade");
   }
}