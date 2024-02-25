
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class GastoDoMes
{
    public static void main(String[] args) {
        int jan = 15000;
        int fev = 23000;
        int mar = 17000;
        int dT = jan + fev + mar;
        int mG = dT/3;
        System.out.printf("Despesa total do trimestre: %d\n", dT);
        System.out.printf("Média mensal de gastos: %d\n", mG);
    }
}
