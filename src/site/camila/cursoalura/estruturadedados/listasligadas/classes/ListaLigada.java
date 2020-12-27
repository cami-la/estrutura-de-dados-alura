package site.camila.cursoalura.estruturadedados.listasligadas.classes;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		if(this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}		
		this.totalDeElementos++;

	}

	@Override
	public String toString() {
		if (this.totalDeElementos == 0)
			return "[]";
		StringBuilder builder = new StringBuilder("[");

		Celula atual = primeira;
		for (int i = 0; i < this.totalDeElementos -1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		
		builder.append(atual.getElemento());
		builder.append("]");

		return builder.toString();
	}

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0)
			this.adicionaNoComeco(elemento);
		else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	public Celula pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posição inexistente!");

		Celula atual = this.primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual; //célula na posição determinada no método
	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) //o elemento será inserido no começo
			this.adicionaNoComeco(elemento);
		else if (posicao == this.totalDeElementos) //o elemento será inserido no último
			this.adiciona(elemento);
		else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();
			
			Celula nova = new Celula(anterior.getProximo(), elemento);
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {
		if (this.totalDeElementos == 0)
			throw new IllegalArgumentException("Lista vazia");
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0) this.ultima = null;
	}

	public void removeDoFim() {
		if (this.totalDeElementos == 1) this.removeDoComeco();
		else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}
	
	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) throw new IllegalArgumentException("Essa posição não existe!");
		
		if (posicao == 0) this.removeDoComeco();
		else if (posicao == this.totalDeElementos - 1) this.removeDoFim();
		else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula atual = anterior.getProximo(); //ou this.pegaCelula.posicao(); - O(N)
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.totalDeElementos--;
		}
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object o) {
		Celula atual = this.primeira;
		
		while(atual != null) {
			if (atual.getElemento().equals(o)) return true;
			
			atual = atual.getProximo();
		}
		return false;
		
	}
}
