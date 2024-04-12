package br.edu.ifmt.academica.rhsis;

public class Main {
	static Funcionario [] listaDeFuncionario = new Funcionario [10];
	public static void main(String[] args) {
		while(true) {
			int op = Teclado.lerInteiro("Opcao: 1-Cadastrar 2-Alterar 3-Excluir 4-Consultar 5-Sair");
			switch(op) {
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
				System.out.println("bye bye, volte sempre!");
				System.exit(0);	
			default: System.out.println("opcao invalida");
				}
		}
	}
	
	private static void cadastrar() {
		String nome = Teclado.lerString("Nome");
		String tipo = Teclado.lerString("Tipo de serviço N1 ou N2: ");
		double salario = Teclado.lerDouble("Valor do salario: ");
		Funcionario a = new Funcionario(nome, tipo, salario);
		
		for(int i = 0; i < listaDeFuncionario.length; i++ ) {
			if(listaDeFuncionario[i] == null) {
				listaDeFuncionario[i] = a;
				break;
			}
		}
	}
	
	private static void alterar() {
		while(true) {
			int opAlterar = Teclado.lerInteiro("opcao para alterar: 1-Nome 2-Tipo de servic1o 3-Retornar ao menu principal");
			switch(opAlterar) {
				case 1:
					alterarNome();
				break;
				case 2:
					alterarTipo();
				break;	
				case 3:
					main(null);
				break;
				default: System.out.println("Opcao invalida");
			}
		}
	}
	
	private static void alterarNome() {
		String nomeAlterar = Teclado.lerString("Nome que deseja alterar: ");
		String nomeAlterado = Teclado.lerString("Novo nome: ");
		int posicao = 0;
		boolean s = true;
		for(int i = 0; i < listaDeFuncionario.length; i++) {
			if(listaDeFuncionario[i] != null) {
				if(listaDeFuncionario[i].getNome().equals(nomeAlterar)) {
					s =false;
					posicao = i;
				break;
				}
			}
		}
		if(s == false) {
			listaDeFuncionario[posicao].setNome(nomeAlterado);
			System.out.println("Nome alterado com sucesso");
		}else {
			System.out.println("Nome nao encontrado");
		}
	}
	
	private static void alterarTipo() {
		String tipoAlterar = Teclado.lerString("Tipo de serviço que deseja alterar: ");
		String tipoAlterado = Teclado.lerString("Novo tipo de servico: ");
		int posicaoTipo = 0;
		boolean d = true;
		for(int i = 0; i < listaDeFuncionario.length; i++) {
			if(listaDeFuncionario[i] != null) {
				if(listaDeFuncionario[i].getTipo().equals(tipoAlterar)) {
					d =false;
					posicaoTipo = i;
				break;
				}
			}
		}
		if(d == false) {
			listaDeFuncionario[posicaoTipo].setTipo(tipoAlterado);
			System.out.println("Tipo de servico alterado com sucesso");
		}else {
			System.out.println("Tipo de servico nao encontrado");
		}
	}
	
	private static void excluir() {
		String nomeExcluir= Teclado.lerString("Digite o nome que deseja excluir: ");
		int posicaoExclusao = 0;
		boolean u = true;
		for (int i = 0; i < listaDeFuncionario.length; i++) {
			if(listaDeFuncionario != null) {
			if (listaDeFuncionario[i].getNome().equals(nomeExcluir)) {
				u =false;
				posicaoExclusao= i;
				
				break;
			}
			}
		}
		if(u == false) {
			listaDeFuncionario[posicaoExclusao] = null;
			System.out.println("Excluido com sucesso");
		}else {
			System.out.println("Nome nao encontrado");
		}
	}
	
	private static void consultar() {
		String consultarNome= Teclado.lerString("Digite o nome que deseja consultar: ");
		boolean s= true;
	
		for (int i = 0; i < listaDeFuncionario.length; i++) {
			if(listaDeFuncionario[i] != null) {
				if (listaDeFuncionario[i].getNome().equals(consultarNome)) {
					s= false;
					System.out.println(listaDeFuncionario[i].toString());
				}
			}	
			
		}
		if(s){
		
			System.out.println("\nNome nao encontrado.\n");
		}
	}
	
	
}
