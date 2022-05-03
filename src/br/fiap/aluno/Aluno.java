package br.fiap.aluno;

//abstract -> classe que n�o pode ser instanciada, ou seja, n�o pode gerar objeto
//final -> classe n�o pode gerar subclasses, ou seja, voc� n�o pode aplicar heran�a
// n�o tem heran�a explicita, ent�o � subclasse de Object
public abstract class Aluno { // abstract diz que ser� uma superclasse
	public long rm;
	public String nome;

	public Aluno(long rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}

	// abstract permite que os c�digos sejam diferentes em cada classe
	public abstract double calcularMedia();

}
