public class ContaDadosTeste
{
    public static void main(String[] args) {
        ContaDados c= new ContaDados();
        c.titular= "Lara";
        c.agencia= "1234-8";
        c.numero=1234;
        c.data= "30/05/2002";
        c.saldo= 0.00;
        System.out.println(c.recuperaDadosParaImpressao());
        
  
        
    }
}