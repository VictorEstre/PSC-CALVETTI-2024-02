import javax.swing.JOptionPane;
public class Ex7Aula2
{
  public static void main(String[] args)
   {
   // Lendo os dados
        String sNome = JOptionPane.showInputDialog("Digite seu nome:");
        String sSexo = JOptionPane.showInputDialog("Digite seu sexo (masculino ou feminino):");
        String sIdade = (JOptionPane.showInputDialog("Digite sua idade:"));
        
        int idade = Integer.parseInt(sIdade);

        // Verificando as condições
        
        if (sSexo.equals("feminino") && idade < 25) {
            JOptionPane.showMessageDialog(null, sNome + ", ACEITA, pois voce e uma mulher e tem menos que 25 anos.");
        } else {
            JOptionPane.showMessageDialog(null, sNome + ", NÃO ACEITA, pois voce tem mais de 25 anos ou nao e do sexo feminino.");
        }
    }
}