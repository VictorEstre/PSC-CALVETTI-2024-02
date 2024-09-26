import javax.swing.JOptionPane;
public class Ex05Aula3
{
  public static void main(String[] args)
   {
      //lendo os dados
      String nome;
      
         // Testando loop
        while (true) {
        nome = JOptionPane.showInputDialog("Digite um nome (digite 'FIM' para encerrar):");
        if (nome.equalsIgnoreCase("FIM")) {
          break; //break serve para encerrar com a palavra citada no enunciado
            }
            //Imprimindo os dados
            System.out.println("Nome digitado: " + nome);
        }
    }
}