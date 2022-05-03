package br.fiap.aluno;

import br.fiap.aluno.Aluno;

public class AlunoGraduacao extends Aluno {

	String curso;
	double prova1;
	double prova2;
	double am;

	public AlunoGraduacao(long rm, String nome, String curso, double prova1, double prova2, double am) {
		super(rm, nome);
		this.curso = curso;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.am = am;
	}

	public double calcularMedia() {
		double mp = (prova1 + prova2) / 2;
		double mf = mp * 0.7 + am * 0.3;
		return mf;
	}
}
