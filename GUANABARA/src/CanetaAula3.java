

public class CanetaAula3 {

	 public String modelo;
	 public String cor;
	 private double ponta;
	 protected int carga;
	 private boolean tampada;
	
	
	public void status() {
		System.out.println("Caneta do modelo: " + this.modelo);
		System.out.println("Caneta da cor: " + this.cor);
		System.out.println("Caneta de ponta: " + this.ponta);
		System.out.println("Carga da caneta: " + this.carga);
		System.out.println("Tamapada: " + this.tampada);
	}
	
	public void grafite() {
			this.ponta= 0.9;
		}
	
	
	public void tampar() {
		
		this.tampada= true;
	}
	
	
	 public void destampar() {
		
		this.tampada=false;
	}
	
	 public void rabiscar() {
		
		if(this.tampada == true || this.carga < 0) {
			System.out.println("Erro, nao posso rabiscar");
		}else 
			System.out.println("Rabiscar");
	}
	
	
}






