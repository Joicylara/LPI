

public class Exercicio8Cap3
{
    public static void main(String[] args) {
       int i, j, t;
       int x = 18;
       for(i = 1; i<= x; i++){
           for(j = 1; j <= i; j++){
               t = i*j;
               System.out.printf("\n%d", t);
           }
       }
    }
}
