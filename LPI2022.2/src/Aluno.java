
public class Aluno {

	private String nome;
	private String matricula;
	private double nota[] = new double[4]; // criação de array em atributos.

	
	public Aluno(String nome, String matricula) {
	
		this.nome = nome;
		this.matricula = matricula;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
		

	public double[] getNota() {
		return nota;
	}


	public void setNota(double[] nota) {
		this.nota = nota;
	}


	public String getStatus() {
		String status;
		double soma = 0, media = 0;
		for(int j = 0; j<4; j++) {
			soma = nota[j]+soma;
		}
		media = soma/4;
		if(media >= 6) {
			status = "Aprovado";
		}else
			if(media >= 4) {
				status = "Prova Final";
			}else {
				status = "Reprovado";
			}
		return status + "=" + media;
	}
	
	public String toString() {
		
		return "\nDados do aluno\n  Nome: " + nome + "\nMatricula: " + matricula +" = " +getStatus() ;
	}
	
	
}
