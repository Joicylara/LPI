package org.sinergiaanimalbrasil.softwareDeCadastroDeAnimal;

public class Gatos extends Animal {
	
	public Gatos(String nome) {
		super(nome);
		//this.somGato = somGato;
	}
	@Override
	public String emitirSom() {
		return "Miau Miau";
		
	}
	
	public String dados() {
		return "\nDADOS DO ANIMAL: \nClassificacao: \nGato \nNome = "+ getNome() + "\nsom do animal: " + emitirSom();
	}

	
}
