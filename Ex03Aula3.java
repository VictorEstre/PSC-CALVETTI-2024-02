import javax.swing.JOptionPane;
public class Ex03Aula3
{
  public static void main(String[] args)
   {
   //ler os valores 
    int soma = 0;
    int quantidade;
    
    String sQuantosnumeros = JOptionPane.showInputDialog("Quantos numeros deseja somar");
    quantidade = Integer.parseInt(sQuantosnumeros);
    
    //Mostrando o loop
    for(int i = 0; i < quantidade; i++){
    String sNumero = JOptionPane.showInputDialog("Digite o numero" + (i+1) + ":");
    int numero = Integer.parseInt(sNumero);
    soma += numero;
    
    //Imprimindo os resultados
    JOptionPane.showMessageDialog(null, "A media da soma dos numeros e: " + (soma / quantidade));}
     
   }
}   
   