
public class TesteColecoes2 {

		public static void main (String args[]) {
			Disciplina disciplina;
			ColecaoDisciplina colecaoDisciplina = new ColecaoDisciplina();
			ImprimeColecao  relatorio;
			
			disciplina = new Disciplina();
			disciplina.setCodigo(1010);
			disciplina.setNome("POO");
			disciplina.setSemestre(2);
			disciplina.setCargaHoraria(60);
			colecaoDisciplina.adicionaDisciplina(disciplina);
			
			disciplina = new Disciplina();
			disciplina.setCodigo(1020);
			disciplina.setNome("Projeto Integrador");
			disciplina.setSemestre(2);
			disciplina.setCargaHoraria(60);
			colecaoDisciplina.adicionaDisciplina(disciplina);
			
			disciplina = new Disciplina();
			disciplina.setCodigo(1030);
			disciplina.setNome("Banco de Dados");
			disciplina.setSemestre(2);
			disciplina.setCargaHoraria(40);
			colecaoDisciplina.adicionaDisciplina(disciplina);
			
			colecaoDisciplina.ordena();
			relatorio = new ImprimeColecao(colecaoDisciplina);
			relatorio.imprimir();
		}
}
