package org.sinergiaanimalbrasil.softwareDeCadastroDeAnimal;

public abstract class  Animal {
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract String emitirSom();
	
	public String dados() {
		return "DADOS DO ANIMAL: Nome = "+ nome + "som: "+emitirSom();
	}
}
