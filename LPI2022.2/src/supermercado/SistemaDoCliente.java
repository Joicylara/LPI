package supermercado;


public class SistemaDoCliente{
	
	static Produto[] listaDeProduto = new Produto[10];
	static ItensPedido[] listaDePedido = new ItensPedido[10];
	
	public static void main(String[]  args) {
		while(true) {
			int op = Teclado.lerInteiro("Opcao: 1-Cadastro do Produto 2- Pedido 3- Consultar pedido 4-lista geral dos produtos 5-lista geral de pedido 7- Sair");
			switch(op){
				case 1:
					cadastrar();
					break;
				case 2:
					pedidos();
					break;
				case 3:
					consultarPedido();
					break;
				case 4:
					listaProduto();
					break;
				case 5:
					listaPedido();
					break;
				case 7:
					System.out.println("Volte sempre!");
					System.exit(0);
					break;
				default: System.out.println("opcao invalida");	
			}
		}
	}
	
	private static void cadastrar() {
		String nome = Teclado.lerString("Nome");
		int quantidade = Teclado.lerInteiro("Quantidade: ");
		double preco = Teclado.lerDouble("Valor do produto: ");
		int cod = Teclado.lerInteiro("Codigo do produto");
		
		Produto l = new Produto(nome, cod,  quantidade, preco);
		
		for(int i = 0; i < listaDeProduto.length; i++ ) {
			if(listaDeProduto[i] == null) {
				listaDeProduto[i] = l;
				break;
			}
		}
		
	}
	
	private static void pedidos() {
		String nomeDoCliente  = Teclado.lerString("Nome do cliente: ");
		String pedido = Teclado.lerString("Nome do produto: ");
		int quantidadeDeProduto = Teclado.lerInteiro("Quantidade de produto: ");
		
		
		ItensPedido p = new ItensPedido (nomeDoCliente, pedido, quantidadeDeProduto);
		
		
		
		for(int i = 0; i < listaDePedido.length; i++ ) {
			if(listaDePedido[i] == null) {
				listaDePedido[i] = p;
				break;
			}
		}
	}
	
	
	private static void consultarPedido() {
		String consultarNome= Teclado.lerString("Nome do cliente: ");
		boolean s= true;
	
		for (int i = 0; i < listaDePedido.length; i++) {
			if(listaDePedido[i] != null) {
				if (listaDePedido[i].getNomeDoCliente().equals(consultarNome)) {
					s= false;
					System.out.println(listaDePedido[i].consultarPedidos());
				}
			}	
			
		}
		if(s){
		
			System.out.println("\nNome nao encontrado.\n");
		}
	}
	
	private static void listaProduto(){
		for (int i = 0; i < listaDeProduto.length; i++) {
			if(listaDeProduto[i] != null) {
					System.out.println(listaDeProduto[i].listaDeProdutos());
				}
			}	
			
		}
	
	private static void listaPedido(){
		for (int i = 0; i < listaDePedido.length; i++) {
			if(listaDePedido[i] != null) {
					System.out.println(listaDePedido[i].consultarPedidos());
				}
			}	
			
		}
	
	}
	