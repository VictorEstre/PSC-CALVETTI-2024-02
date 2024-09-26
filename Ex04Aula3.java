import javax.swing.JOptionPane;
public class Ex04Aula3
{
  public static void main(String[] args)
   {
      //lendo os dados
      int contador = 0;
       int numero;


         // testando o loop
        while (true) {
            String entrada = JOptionPane.showInputDialog("Digite um número (0 para encerrar):");
            numero = Integer.parseInt(entrada);
            
         // Quando der 0, para de perguntar (usa-se break)
        if (numero == 0) {
        break;
         }
        if (numero >= 100 && numero <= 200) {
            contador++;
            }
        }

         // Imprimindo os dados
        JOptionPane.showMessageDialog(null, "Total de números entre 100 e 200: " + contador);
       

   }
}   

        
        