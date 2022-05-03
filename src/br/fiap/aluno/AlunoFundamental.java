package br.fiap.aluno;

import br.fiap.aluno.Aluno;

public class AlunoFundamental extends Aluno {
	int serie;
	double prova1;
	double prova2;

	public AlunoFundamental(long rm, String nome, int serie, double prova1, double prova2) {
		super(rm, nome); // chamada para o construtor da superclasse Aluno
		this.serie = serie;
		this.prova1 = prova1;
		this.prova2 = prova2;
	}

	public double calcularMedia() {
		return (prova1 + prova2) / 2;
	}
}
