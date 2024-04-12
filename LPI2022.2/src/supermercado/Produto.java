package supermercado;
	public class Produto {
		private String nome;
		private int cod;
		private int quantidade;
		private double preco;
		
	public Produto (String nome, int cod, int quantidade, double preco) {
		this.nome = nome;
		this.cod = cod;
		this.quantidade = quantidade;
		this.preco = preco;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static Produto buscarProduto(String pedido) {
		// encontrar o pedido (pedido= nome do produto)(string) na lista de produto e retorna-lo
		
		for(int i = 0; i< SistemaDoCliente.listaDeProduto.length; i++) {
			if( SistemaDoCliente.listaDeProduto[i]!=null) {
				 if( SistemaDoCliente.listaDeProduto[i].getNome().equals(pedido)) {
					 return  SistemaDoCliente.listaDeProduto[i];
				 }
			}
			
		}
		return null;
	}
	
	public  String listaDeProdutos() {
		return "Produto: \ntipo = " + nome + ", codigo = " + cod + ", preco = " + preco + ", quantidade = " + quantidade;
	}
	
	}
		