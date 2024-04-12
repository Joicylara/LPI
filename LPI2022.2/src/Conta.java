
public class Conta{
     String titular;
     String agencia;
     int numero;
     double saldo;
     String data;
     
    public double sacar(double valor){
        return saldo= saldo-valor;
    }
    public double depositar(double valor){
        return  saldo= saldo+valor;
    }
    public double calcular(){
        return saldo= saldo * 0.1;
    }
}

