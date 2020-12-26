package site.camila.cursoalura.estruturadedados.executavel;

import site.camila.cursoalura.estruturadedados.classes.Aluno;
import site.camila.cursoalura.estruturadedados.classes.Vetor;

public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("José");
		
		Vetor lista = new Vetor();
		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		Aluno a3 = new Aluno("Danilo");
		System.out.println(lista.contem(a3));
		
		Aluno x = lista.pega(1);
		
		System.out.println(x);
		//System.out.println(lista.pega(1));
		
		lista.adiciona(1, a3);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);

		

	}

}
