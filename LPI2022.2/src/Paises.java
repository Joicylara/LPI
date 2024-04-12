
public class Paises {

	private String codigoISO;
	private String nomePais;
	private String populacao;
	private String dimensao;
	
	
	public Paises(String codigoISO, String nomePais, String dimensao) {
		
		this.codigoISO = codigoISO;
		this.nomePais = nomePais;
		this.dimensao = dimensao;
	}


	public String getCodigoISO() {
		return codigoISO;
	}


	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}


	public String getNomePais() {
		return nomePais;
	}


	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}


	public String getPopulacao() {
		return populacao;
	}


	public void setPopulacao(String populacao) {
		this.populacao = populacao;
	}


	public String getDimensao() {
		return dimensao;
	}


	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}


	
	
	
	
	
	
	
	
}
