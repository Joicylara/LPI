
public class ListaPaises {
	
	static Paises[] listaDePaises = new Paises[6];
	
	public static void main(String[] args){
		while(true) {
			int op = Teclado.lerInteiro("\nOpcao: 0- Cadastrar 1- Verificar 2- Paises Limitrofes 3- Densidade populacional 4- Paises vizinhos 5- Sair \n");
			switch(op) {
			
			case 0: 
				cadastrar();
			break;
			case 5: 
				System.exit(0);
				break;
			}
		}
		}
		
		private static void cadastrar() {
			String codigoISO = Teclado.lerString("\nCodigo: \n");
			String nomePais = Teclado.lerString("\nNome do Pais: \n");
			String populacao = Teclado.lerString("\nPopulacao: \n");
			String dimensao = Teclado.lerString("\nDimensao: \n");

			Paises p = new Paises(codigoISO, nomePais, dimensao);
			Paises p2 = new Paises(codigoISO, nomePais, dimensao);

			for (int i = 0; i < listaDePaises.length; i++) {

				if (listaDePaises[i] == null) {
					listaDePaises[i] = p;
					break;
				}
			}
		}
		
		private static void Verificar() {
			
		}
		
		
}
