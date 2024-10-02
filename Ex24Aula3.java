import javax.swing.JOptionPane;
public class Ex24Aula3
{
  public static void main(String[] args)
   {
         //lendo os dados
         
        double totalAPagar = 0;

        while (true) {
            double preco;
            do {
                String entradaPreco = JOptionPane.showInputDialog("Digite o preco da mercadoria (ou 0 para encerrar):");
                preco = Double.parseDouble(entradaPreco);
                if (preco < 0) {
                    JOptionPane.showMessageDialog(null, "Preço invalido! Digite novamente.");
                }
            } while (preco < 0);

            
            if (preco == 0) {
                break;
            }

            int quantidade;
            do {
                String entradaQuantidade = JOptionPane.showInputDialog("Digite a quantidade comprada:");
                quantidade = Integer.parseInt(entradaQuantidade);
                if (quantidade < 0) {
                    JOptionPane.showMessageDialog(null, "Quantidade invalida! Digite novamente.");
                }
            } while (quantidade < 0);

            totalAPagar += preco * quantidade;
        }

        JOptionPane.showMessageDialog(null, "Total a ser pago: R$ " + String.format("%.2f", totalAPagar));
    }
}