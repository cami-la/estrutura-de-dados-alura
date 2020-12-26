package site.camila.cursoalura.estruturadedados.vetores.classes;

import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void garanteEspaco() {
		if (totalDeAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}

	}

	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= alunos.length;
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	public void adiciona(Aluno aluno) {
		this.garanteEspaco();

		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;

		/*
		 * for(int i = 0; i < alunos.length; i++) { if (alunos[i] == null) { alunos[i] =
		 * aluno; break; } }
		 */
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();

		if (!posicaoValida(posicao)) throw new IllegalArgumentException("Posição Inválida!");
		
		for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) alunos[i + 1] = alunos[i];
		
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posição Inválida!");
		return alunos[posicao];
	}

	public void remove(int posicao) {
		for (int i = posicao; i < this.totalDeAlunos; i++)
			this.alunos[i] = this.alunos[i + 1];
		totalDeAlunos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {
			if (alunos[i].equals(aluno))
				return true;
		}
		return false;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}
}
