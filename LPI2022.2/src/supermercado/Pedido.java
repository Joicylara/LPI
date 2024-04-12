package supermercado;

	public class Pedido {
	ItensPedido[] itens = new ItensPedido[10];
	String pagamento;
	
	public void itensPedido(ItensPedido itemPedido) {
		for(int i = 0; i < itens.length; i++){
			if(itens[i] == null) {
			itens[i] = itemPedido;
			int novo = itemPedido.getProduto().getQuantidade() - itemPedido.getQuantidadeDeProduto();
			itemPedido.getProduto().setQuantidade(novo);
			break;
			}
		}
	}
	
	/*public void encerrarPedido(){
		for
	}*/
}
