import javax.swing.JOptionPane;
public class Ex21Aula3
{
  public static void main(String[] args)
   {
         //lendo os dados  
         
         for (int i = 1; i <= 20; i++) {
            
            String sNome = JOptionPane.showInputDialog("Digite o nome da pessoa " + i + ":");
            int iIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + sNome + ":"));
            String sSexo = JOptionPane.showInputDialog("Digite o sexo de " + sNome + " (M/F):").toUpperCase();
            
            //Testando o resultado
            if (sSexo.equals("M") && iIdade > 21) {
                JOptionPane.showMessageDialog(null, "O nome do rapaz com mais de 21 anos apresentado foi: " + sNome);
            }
        }
    }
}