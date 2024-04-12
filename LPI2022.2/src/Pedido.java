class Pedido{
	private Produto produto;
	private String nomeDoCliente;
	
	private int quantidadeDeProduto;
	
	public Produto buscarProduto(String pedido) {
		// encontrar o pedido (pedido= nome do produto)(string) na lista de produto e retorna-lo
		
		for(int i=0; i< SistemaDoCliente.listaDeProduto.length; i++) {
			if( SistemaDoCliente.listaDeProduto[i]!=null) {
				 if( SistemaDoCliente.listaDeProduto[i].getNome().equals(pedido)) {
					 return  SistemaDoCliente.listaDeProduto[i];
				 }
			}
			
		}
		return null;
	}
	
	public Pedido(String nomeDoCliente, String pedido, int quantidadeDeProduto) {
		this.nomeDoCliente = nomeDoCliente;
		
		this.quantidadeDeProduto = quantidadeDeProduto;
		this.produto = buscarProduto(pedido);
	}


	public String getNomeDoCliente() {
		return nomeDoCliente;
	}


	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}


	public int getQuantidadeDeProduto() {
		return quantidadeDeProduto;
	}


	public void setQuantidadeDeProduto(int quantidadeDeProduto) {
		this.quantidadeDeProduto = quantidadeDeProduto;
	}
	
	public double total(){
		double totalPagar = 0;
		totalPagar = produto.getPreco()*quantidadeDeProduto;
	return totalPagar;
	}
	
	
	
	public String consultarPedidos() {
	 return "Pedido: \nNome do cliente = \n" + nomeDoCliente  + "\nquantidade  = \n" + quantidadeDeProduto+ "\ntotal = \n" + total();
	}
}