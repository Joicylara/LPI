

public class Exercicio7Cap3
{
    public static void main(String[] args) {
       int x= 150;
       while(x != 1)
       if(x % 2 == 0){
             System.out.printf("X é par: %d\n", x = (x/2));
        }else{
            System.out.printf("X é impar: %d\n", x = (3 * x + 1));
        }
    }
}
