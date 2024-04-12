package br.edu.ifmt.academica.rhsis;

public class Funcionario {

	private String nome;
	private String tipo;
	private double salario;
	
	public Funcionario(String nome, String tipo, double salario) {
		this.nome = nome;
		this.tipo = tipo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getCalculoSalario() {
			if(tipo == "N1") {
				salario =(salario * 0.1) + salario;
			}else
			{
				salario = (salario + 1.200);
			}
			return salario;
			
	}

	public String toString() {
		return"\nInformacoes do funcionario\n Nome: " + nome + "Tipo de servico: " + tipo + "Salario: " + getCalculoSalario();
	}
}
