
public class ContaData{
     private String titular;
     private String agencia;
     private int numero;
     private double saldo;
     private Data dataAbertura;
     private String d;
     
     double sacar(double valor){
        return saldo= saldo-valor;
    }
     double depositar(double valor){
        return  saldo= saldo+valor;
    }
     double calcular(){
        return saldo= saldo * 0.1;
    }
     String recuperaDadosParaImpressao(){
        d= "Titular: " + this.titular;
        d= d+ "\nAgencia: " + this.agencia;
        d= d+ "\nNumero: " + this.numero;
        d= d+ "\nSaldo inicial: " + this.saldo;
        d= d+ "\nSaldo apos o deposito: " + this.depositar(100);
        d= d+ "\nSaldo apos o saque: " + this.sacar(35);
        d= d+ "\nRendimento mensal: " + this.calcular();
       // d= d+ "\ndia " + this.dataAbertura.dia + " mes "+ this.dataAbertura.mes + " Ano " + this.dataAbertura.ano;
        d= d+ "\nData de emissao: " + this.dataAbertura.formatada();
        //this é usado para se referir a um atributo fora do metodo
        return d;
    }
}
