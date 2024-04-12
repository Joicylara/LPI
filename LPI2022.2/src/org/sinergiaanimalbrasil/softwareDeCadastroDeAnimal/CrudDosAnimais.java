package org.sinergiaanimalbrasil.softwareDeCadastroDeAnimal;
import java.util.InputMismatchException;

import br.edu.ifmt.academico.util.teclado.Teclado;

public class CrudDosAnimais  {
	static Animal[] listaDeAnimal = new Animal[10];
	public static void main(String[]  args) {
	while(true) {
		try {
		System.out.println("Bem-Vindo ao veterinario");
			int op = Teclado.lerInteiro("1-Cadastrar animal 2-Consultar 3- Alterar 4-Excluir 5-Sair");
			switch(op) {
				case 1:
					cadastrar();
				break;
				case 2:
					consultar();
				break;
				case 3:	
					alterar();
				break;
				case 4:
					excluir();
				case 5:
					System.out.println("Volte sempre!");
					System.exit(0);
				break;
				default: System.out.println("opcao invalida");	
				}
			}catch(InputMismatchException ime) {
				System.out.println("opcao invalida, digite somente o numero sugerido");
			}
		}	
	}	
	
	private static void cadastrar() {
		try {
			String nome = Teclado.lerString("Nome do animal: ");
			int tipoAnimal = Teclado.lerInteiro("Classificacao do animal: \nDigite 1 para cachorro ou 2 para gato");
				for(int i = 0; i < listaDeAnimal.length; i++ ) {
					if(listaDeAnimal[i] == null) {
						if(tipoAnimal == 1) {
							Cachorros c = new Cachorros(nome);
							listaDeAnimal[i] = c;
							break;
						}else
							if(tipoAnimal ==2) {
								Gatos g = new Gatos(nome);
								listaDeAnimal[i] = g;
								break;
								}
						}
					}
		}catch(InputMismatchException ime) {
			System.out.println("opcao invalida, digite somente o numero sugerido");
		}
	}
	
	private static void consultar() {
		String consultarNome= Teclado.lerString("Digite o nome que deseja consultar: ");
		boolean s= true;
		for (int i = 0; i < listaDeAnimal.length; i++) {
			if(listaDeAnimal[i] != null) {
				//System.out.println(listaDeAnimal[i].getNome());
				if (listaDeAnimal[i].getNome().trim().equals(consultarNome)) {
				s= false;
				System.out.println(listaDeAnimal[i].dados());
				}
			}	
			
		}
		if(s){
		
			System.out.println("\nNome nao encontrado.\n");
		}
	}
	
	
	private static void alterar() {
		try {
			String alterarNome = Teclado.lerString("Nome do animal que deseja alterar");
			String novoNome = Teclado.lerString("Novo nome: ");
				for(int i =0; i< listaDeAnimal.length; i++) {
					if(listaDeAnimal != null) {
						if (listaDeAnimal[i].getNome().equals(alterarNome)) {
							listaDeAnimal[i].setNome(novoNome);
							break;
							}
						}
					}
		System.out.println("Nome alterado com sucesso!");
		}catch(NullPointerException np) {
			System.out.println("Nome que deseja alterar nao existe no sistema");
		}
	}
	
private static void excluir() {
	try {	
		String dadosExcluir= Teclado.lerString("Digite o nome do animal que deseja excluir: ");
		for (int i = 0; i < listaDeAnimal.length; i++) {
			if(listaDeAnimal != null) {
			if (listaDeAnimal[i].getNome().equals(dadosExcluir)) {
				listaDeAnimal[i] = null;
				break;
			}
			}
		}
		System.out.println("\n Dados do animal excluido com sucesso\n");
		for (int i = 0; i < listaDeAnimal.length; i++) {
			if (listaDeAnimal[i] != null) {
				System.out.println("\nLista de animal: \n"+ listaDeAnimal[i].dados());
			}
		}
	}catch(NullPointerException ne) {
		System.out.println("Nome nao encotrado no sistema para a exclusao");
	}
	main(null);
}
}
