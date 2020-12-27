package site.camila.cursoalura.estruturadedados.pilha.executavel;

import java.util.Stack;

import site.camila.cursoalura.estruturadedados.pilha.classes.Pilha;

public class TesteDaPilha {
	public static void main(String[] args) {
		/*Pilha pilha = new Pilha();
		
		pilha.push("Mauricio");
		System.out.println(pilha);
		pilha.push("Guilherme");
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		pilha.push("Marcelo");
		System.out.println(pilha.vazia());
		System.out.println(pilha);*/
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Mauricio"); //insere na pilha
		stack.push("Marcelo");
		
		System.out.println(stack); 
		
		System.out.println(stack.pop()); //retira da pilha
		System.out.println(stack);
		
		String nome = stack.peek(); //indica quem está no primeiro da pilha
		System.out.println(nome);
	}
}
