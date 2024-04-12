package supermercado;
class ItensPedido{
	private Produto produto;
	private String nomeDoCliente;
	private int quantidadeDeProduto;
	
	
	
	public ItensPedido(String nomeDoCliente, String pedido, int quantidadeDeProduto) {
		this.nomeDoCliente = nomeDoCliente;
		this.quantidadeDeProduto = quantidadeDeProduto;
		this.produto = Produto.buscarProduto(pedido);
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
	
	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
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