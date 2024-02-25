public class ContaTeste
{
    public static void main(String[] args) {
        Conta c= new Conta();
        c.titular= "Lara";
        c.agencia= "1234-8";
        c.numero=1234;
        c.data= "30/05/2002";
        c.saldo= 0.00;
        System.out.println("Saldo: " + c.saldo);
        c.depositar(100);
        System.out.println("Saldo: " + c.saldo);
        c.sacar(35);
        System.out.println("Saldo: " + c.saldo);
        System.out.printf("Redimento mensal: " + c.calcular());
  
        
    }
}