
public class Caneta {

	 String modelo;
	 String cor;
	 double ponta;
	 int carga;
	 boolean tampada;
	
	
	public void status() {
		System.out.println("Caneta do modelo: " + this.modelo);
		System.out.println("Caneta da cor: " + this.cor);
		System.out.println("Caneta de ponta: " + this.ponta);
		System.out.println("Carga da caneta: " + this.carga);
		System.out.println("Tamapada: " + this.tampada);
	}
	
	
	
	
	 void tampar() {
		
		this.tampada= true;
	}
	
	
	 void destampar() {
		
		this.tampada=false;
	}
	
	 void rabiscar() {
		
		if(this.tampada == true || this.carga < 0) {
			System.out.println("Erro, nao posso rabiscar");
		}else 
			System.out.println("Rabiscar");
	}
	
	
}





