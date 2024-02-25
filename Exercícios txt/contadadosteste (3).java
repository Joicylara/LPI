
/*Exercício 4- criar outra conta, se forem iguais criar outra referencia
resultado: ao compilar a resposta foi que as contas são diferentes, mesmo elas recebendo os mesmo "valores"*/

public class ContaDadosTeste
{
    public static void main(String[] args) {
        ContaDados c= new ContaDados();
        c.titular= "Lara";
        c.agencia= "1234-8";
        c.numero=1234;
        c.data= "30/05/2002";
        c.saldo= 0.00;
        
        ContaDados c2= new ContaDados();
        /*c2.titular= "Maria";
        c2.agencia= "1234-8";
        c2.numero=1234;
        c2.data= "30/05/2002";
        c2.saldo= 0.00;*/
        c2 = c;
        if(c == c2){
            System.out.println("Contas iguais");
        }else{
            System.out.println("Contas diferentes");
        }
        System.out.println(c.recuperaDadosParaImpressao());
        
  
        
    }
}