package org.sinergiaanimalbrasil.softwareDeCadastroDeAnimal;

public class Cachorros extends Animal  {
	public Cachorros(String nome) {
		super(nome);	
	}

	@Override
	public String emitirSom() {
		return "AUAUAUAUA";
	}
 
	public String dados() {
		return "\nDADOS DO ANIMAL: \nClassificacao: Cachorro \nNome = "+ getNome()+ "\nsom: " +emitirSom();
	}
	
}
