

public class Exercicio6Cap3
{
    public static void main(String[] args) {
        int p= 1;
        int s= 0;
        int t;
        System.out.println(p);// só para aparecer o primeiro 1 da sequência
       while(p < 100){
             t = s + p;
             s = p;
             p = t;
            System.out.println(p);
       }
    }
}
