

public class ContaDados{
     String titular;
     String agencia;
     int numero;
     double saldo;
     String data;
     String d;
     
    public double sacar(double valor){
        return saldo= saldo-valor;
    }
    public double depositar(double valor){
        return  saldo= saldo+valor;
    }
    public double calcular(){
        return saldo= saldo * 0.1;
    }
    public String recuperaDadosParaImpressao(){
        d= "Titular: " + this.titular;
        d= d+ "\nAgência: " + this.agencia;
        d= d+ "\nNúmero: " + this.numero;
        d= d+ "\nData de abertura: " + this.data;
        d= d+ "\nSaldo inicial: " + this.saldo;
        d= d+ "\nSaldo após o deposito: " + this.depositar(100);
        d= d+ "\nSaldo após o saque: " + this.sacar(35);
        d= d+ "\nRendimento mensal: " + this.calcular();
        /*this é usado para se referir a um atributo fora do metodo*/
        return d;
    }
}

