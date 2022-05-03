package br.fiap.aluno;

public class AlunoPosGraduacao extends Aluno {

	String curso;
	double trabalho1;
	double trabalho2;

	public AlunoPosGraduacao(long rm, String nome, String curso, double trabalho1, double trabalho2) {
		super(rm, nome);
		this.curso = curso;
		this.trabalho1 = trabalho1;
		this.trabalho2 = trabalho2;
	}

	@Override
	public double calcularMedia() {
		return trabalho1 * 0.40 + trabalho2 * 0.60;
	}

}
