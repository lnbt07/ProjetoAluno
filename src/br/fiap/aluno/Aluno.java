package br.fiap.aluno;

//abstract -> classe que não pode ser instanciada, ou seja, não pode gerar objeto
//final -> classe não pode gerar subclasses, ou seja, você não pode aplicar herança
// não tem herança explicita, então é subclasse de Object
public abstract class Aluno { // abstract diz que será uma superclasse
	public long rm;
	public String nome;

	public Aluno(long rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}

	// abstract permite que os códigos sejam diferentes em cada classe
	public abstract double calcularMedia();

}
