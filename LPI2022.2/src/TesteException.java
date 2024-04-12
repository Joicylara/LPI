
public class TesteException {
	public static void main(String[]  args) {
		while(true) {
			try {
				int x =Teclado.lerInteiro("digite um numero: ");
				int y=Teclado.lerInteiro("digite um numero: ");
				System.out.println("divisao: "+x/y);
			}catch(ArithmeticException  TesteException) {
				System.out.println("nao divisivel ");
			}	
		}
	}	
}
