package aula_11;

public class Bolsista extends Aluno {

	private float bolsa;

	/* Construtor padr�o */
	public Bolsista() {

	}

	/* GETTERS AND SETTERS */
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	/* Declarando metados */
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);

	}

	/* Declarando metado sobescrito */
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " � bolsista !");

	}

}
