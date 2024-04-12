
public class TesteColecoes {

	public static void main(String args[]) {
		Aluno aluno;
		ColecaoAluno colecaoAluno = new ColecaoAluno();
		
		ImprimeColecao relatorio;
		
		aluno = new Aluno();
		aluno.setMatricula(10);
		aluno.setNome("Ana");
		aluno.setSemestre(1);
		colecaoAluno.adicionaAluno(aluno);
		
		aluno = new Aluno();
		aluno.setMatricula(20);
		aluno.setNome("Lua");
		aluno.setSemestre(2);
		colecaoAluno.adicionaAluno(aluno);
		
		aluno = new Aluno();
		aluno.setMatricula(30);
		aluno.setNome("Bia");
		aluno.setSemestre(2);
		colecaoAluno.adicionaAluno(aluno);
		
		colecaoAluno.ordena();
		relatorio = new ImprimeColecao(colecaoAluno);
		relatorio.imprimir();
	}
}
