package site.camila.cursoalura.estruturadedados.fila.executavel;

import java.util.LinkedList;
import java.util.Queue;

import site.camila.cursoalura.estruturadedados.fila.classes.Fila;

public class TesteDaFila {

	public static void main(String[] args) {
		/*Fila fila = new Fila();
		
		fila.adiciona("Mauricio");
		fila.adiciona("Guilherme");
		
		System.out.println(fila);
		
		String x1 = fila.remove();
		System.out.println(x1);
		System.out.println(fila);
		*/
		
		Queue<String> filaDoJava = new LinkedList<String>();
		filaDoJava.add("Maurício");
		filaDoJava.add("Ricardo");
		System.out.println(filaDoJava);
		
		String x2 = filaDoJava.poll(); //retira o primeiro que entrou
		System.out.println(x2);
		
		System.out.println(filaDoJava);
	}

}
