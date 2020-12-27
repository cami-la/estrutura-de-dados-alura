package site.camila.cursoalura.estruturadedados.pilha.classes;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	public void push(String nome) {
		this.nomes.add(nome);
	}
	
	public String pop() {
		return nomes.remove(nomes.size()-1);
	}
	
	public boolean vazia() {
		return nomes.isEmpty(); //nomes.size == 0;
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
}
