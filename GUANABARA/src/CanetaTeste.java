public class CanetaTeste {
	public static void main(String[] args) {

		Caneta c1= new Caneta();
		
		
		
		c1.modelo = "big";
		c1.cor = "azul";
		c1.ponta = 0.7;
		c1.carga = 25;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2= new Caneta();
		c2.modelo="fabrica Castello";
		c2.cor= "preto";
		c2.ponta= 0.9;
		c2.carga= 62;
		c2.status();
		c2.tampar();
		c2.rabiscar();
		
		
	}

}

