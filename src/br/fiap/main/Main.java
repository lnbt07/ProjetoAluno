package br.fiap.main;

import br.fiap.aluno.Aluno;
import br.fiap.aluno.AlunoFundamental;
import br.fiap.aluno.AlunoGraduacao;

public class Main {
	public static void main(String[] args) {

		Aluno[] aluno = new Aluno[3];
		
		aluno[0] = new AlunoFundamental(1, "Selmini", 1, 10, 10);
		aluno[1] = new AlunoFundamental(2, "Ismael", 2, 8, 8.5);
		aluno[2] = new AlunoFundamental(3, "Pinho", 3, 10, 8);

		for (int i = 0; i < aluno.length; i++) {
			System.out.println(aluno[i].nome);
			System.out.println(aluno[i].calcularMedia());
		}
	}
}