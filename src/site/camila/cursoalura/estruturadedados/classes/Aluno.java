package site.camila.cursoalura.estruturadedados.classes;

public class Aluno {
	//atributos
	private String nome;
	
	//métodos especiais
	public Aluno(String nome) {
		this.nome = nome;		
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj; //casting
		return outro.getNome().equals(this.getNome());
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
