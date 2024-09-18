import javax.swing.JOptionPane;
public class Ex05
{
   public static void main(String[] args)
   {
     

   //Valor passado no crédito - R$100,00
   double dDividaInicial = 100.0;
   double dJuros = 10.0 / 100.0;
   double dDivida1mes = (dDividaInicial * dJuros) + dDividaInicial;
   double dDivida2mes = (dDivida1mes * dJuros) + dDivida1mes;
   double dDivida3mes = (dDivida2mes * dJuros) + dDivida2mes;
   double dDivida4mes = (dDivida3mes * dJuros) + dDivida3mes;
   double dDivida5mes = (dDivida4mes * dJuros) + dDivida4mes;
   double dDivida6mes = (dDivida5mes * dJuros) + dDivida5mes;
   double dDivida7mes = (dDivida6mes * dJuros) + dDivida6mes;
   double dDivida8mes = (dDivida7mes * dJuros) + dDivida7mes;
  
  
  
  
   JOptionPane.showMessageDialog(null, "O valor da divida apos 8 meses sera: " + dDivida8mes );
      
   }
}