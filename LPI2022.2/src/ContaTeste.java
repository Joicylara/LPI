

public class ContaTeste
{
    public static void main(String[] args) {
        ContaData c= new ContaData();
        //c.titular= "Lara";
        //c.agencia= "1234-8";
        //c.numero=1234;
        //c.saldo= 0.00;
        
        Data d= new Data();
        
        d.dadosData(30, 05, 20);
 
        //c.dataAbertura = d;
    
        System.out.println(c.recuperaDadosParaImpressao());
        

        
    }
}