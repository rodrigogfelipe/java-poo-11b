package aula_11;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;

	/* Construtor padrao */
	public Aluno() {

	}

	/* GETTERS AND SETTERS */
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	/* Declarando o metado */
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno " + this.nome);

	}

}
