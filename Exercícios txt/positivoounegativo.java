import java.util.Scanner;

public class PositivoouNegativo
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;
        System.out.printf("Informe um numero: ");
        a= ler.nextInt();
            if(a%2==0){
                System.out.println("O número informado é par ");
            }else{
                System.out.println("O número informado é ímpar");
            }
    }
}
