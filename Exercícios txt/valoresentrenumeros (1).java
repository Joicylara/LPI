public class ValoresEntreNumeros
{
    public static void main(String[] args) {
           int i;
           int s=0;
            for(i=1; i<=10; i++){
                int a = Teclado.lerInteiro("Informe um numero: ");
                if(a>=0 && a<=100){
                  s=s+i;
                  System.out.println("Quantidades de valores entre 0 e 100" );
                }else if(a>=101 && a<=200){
                    s=s+i;
                    System.out.println("Quantidades de valores entre 101 e 200" );
                }else if(a>200){
                    System.out.println("Quantidades de valores maiores 200" );
                }
                
            } 
    }
}