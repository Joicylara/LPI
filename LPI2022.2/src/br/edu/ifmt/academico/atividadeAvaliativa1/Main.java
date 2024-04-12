package br.edu.ifmt.academico.atividadeAvaliativa1;

import br.edu.ifmt.academico.util.teclado.Teclado;


public class Main {

	static Aluno[] listaDeAlunos = new Aluno[10];
	
	public static void main(String[] args) {

		while (true) {

			int op = Teclado.lerInteiro("\nDigite a opcao desejada: 1- Cadastrar 2- Alterar 3- Excluir 4- Consultar 5- Lancar nota 6- Sair\n");
			switch (op) {
			case 1:
				cadastrar();
				break;
			case 2:
				alterar();
				break;
			case 3:
				excluir();
				break;
			case 4:
				consultar();
				break;
			case 5:
				lancarNota();
				break;

			case 6:
				System.out.println("Bye! Volte sempre.");
				System.exit(0);
				break;
			default : System.out.println("Opcao invalida");	
			}

		}
	}

	private static void cadastrar() {

		String nome = Teclado.lerString("Nome: ");
		String matricula = Teclado.lerString("Matricula: ");

		Aluno a = new Aluno(nome, matricula);
		
		for(int i = 0; i<=listaDeAlunos.length; i++) {
			if(listaDeAlunos[i] == null){
				
				listaDeAlunos[i] = a;
				break;
			}
		}
	}

	private static int alterar() {
		while(true) {
			int opAlterar = Teclado.lerInteiro("\nAlterar: \n1- Nome \n2- Matricula \n3- Retornar ao menu\n");
			switch(opAlterar) {
			case 1:
				alterarNome();
				break;
			case 2:
				alterarMatricula();
				break;
			case 3:
				main(null);
				break;
			default: System.out.println("Opcao invalida");
				break;
			}
		}
		
	}
	
	private static void alterarNome() {
		String nome = Teclado.lerString("Nome que sera alterado: ");
		String nomeAlterar = Teclado.lerString("Novo nome: ");
		
		int posicaoAlterar = 0;
		for (int i = 0; i < listaDeAlunos.length; i++) {
			if(listaDeAlunos != null) {
				if (listaDeAlunos[i].getNome().equals(nome)) {
				
				posicaoAlterar= i;
				
			break;
			}
			}
		}
	
		listaDeAlunos[posicaoAlterar].setNome(nomeAlterar);
		
		System.out.println("\nNome alterado\n");
		
		for (int i = 0; i < listaDeAlunos.length; i++) {
			if (listaDeAlunos[i] != null) {
				System.out.println("\n Alunos: \n"+ listaDeAlunos[i].toString());
			}
		}
		
	}
	
	
	private static void alterarMatricula() {
		String matricula = Teclado.lerString("Matricula que sera alterada: ");
		String matriculaAlterar = Teclado.lerString("Nova matricula: ");
		
		int posicaoAlterar = 0;
		for (int i = 0; i < listaDeAlunos.length; i++) {
			if(listaDeAlunos != null) {
				if (listaDeAlunos[i].getMatricula().equals(matricula)) {
				
				posicaoAlterar= i;
				
			break;
			}
			}
		}
	
		listaDeAlunos[posicaoAlterar].setMatricula(matriculaAlterar);
		
		System.out.println("\nMatricula alterada\n");
		
		for (int i = 0; i < listaDeAlunos.length; i++) {
			if (listaDeAlunos[i] != null) {
				System.out.println("\nLista de Alunos: \n"+ listaDeAlunos[i].toString());
			}
		}
	}
	
	private static void excluir() {
		
		String matriculaExluir= Teclado.lerString("Digite o numero de matricula: ");
		int posicaoExclusao = 0;
		for (int i = 0; i < listaDeAlunos.length; i++) {
			if(listaDeAlunos != null) {
			if (listaDeAlunos[i].getMatricula().equals(matriculaExluir)) {
				
				posicaoExclusao= i;
				
				break;
			}
			}
		}
	
		listaDeAlunos[posicaoExclusao] = null;
		
		System.out.println("\n Dados do aluno excluido com sucesso\n");
		
		for (int i = 0; i < listaDeAlunos.length; i++) {
			if (listaDeAlunos[i] != null) {
				System.out.println("\nLista de alunos: \n"+ listaDeAlunos[i].toString());
			}
		}
	}
	
	private static void consultar() {
		String consultarNome= Teclado.lerString("Digite o nome que deseja consultar: ");
		boolean s= true;
	
		for (int i = 0; i < listaDeAlunos.length; i++) {
			if(listaDeAlunos[i] != null) {
				if (listaDeAlunos[i].getNome().equals(consultarNome)) {
				s= false;
				System.out.println(listaDeAlunos[i].toString());
				
			}
			}	
			
		}
		if(s){
		
			System.out.println("\nNome nao encontrado.\n");
		}
	}
	
	
	private static void lancarNota() {
		
		String matricula = Teclado.lerString("Matricula: ");

		for (int i = 0; i < listaDeAlunos.length; i++) {
			Aluno a = listaDeAlunos[i];
			if(a != null && a.getMatricula().equals(matricula)){
				for(int j = 0; j<4; j++) {
					double nota = Teclado.lerDouble("Digite a nota: ");
					a.getNota()[j] = nota;
				}
				System.out.println("Notas lançadas com sucesso.");
				break;
			}
		}				
	}		
}	
		