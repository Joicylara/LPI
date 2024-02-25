public class Tabuada
{
    public static void main(String[] args) {
        int i;
        int s=0;
        int a = Teclado.lerInteiro("Informe um numero: ");
            for(i=0; i<=10; i++){
                s=i*a;
                System.out.println("Tabuada: " +a+ "x" +i+ "= " +s);  
            }
        
    }
}