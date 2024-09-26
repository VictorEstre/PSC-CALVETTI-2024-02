import javax.swing.JOptionPane;
public class Ex12Aula3
{
  public static void main(String[] args)
   {
   //ler os valores 
    int iMenorque21 = 0;
    int iMaisDe50 = 0;


         // Testando loop
       while (true) {
       String sEntrada = JOptionPane.showInputDialog("Digite a idade (0-120) ou um numero fora da faixa para sair:");

       if (sEntrada == null) {
       break; 
       }

       int idade;
       try {
       idade = Integer.parseInt(sEntrada);
       } catch (NumberFormatException e) {
       JOptionPane.showMessageDialog(null, "OPS!, nao e uma idade valida.");
       continue;
        }

       if (idade < 0 || idade > 120) {
       break; // Parar se a idade estiver fora da faixa
        }

        if (idade < 21) {
         iMenorque21++;
         }
        if (idade > 50) {
         iMaisDe50++;
            }
        }

         //Imprimindo os dados
        JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + iMenorque21 + "\nTotal de pessoas com mais de 50 anos: " + iMaisDe50);
    }
}