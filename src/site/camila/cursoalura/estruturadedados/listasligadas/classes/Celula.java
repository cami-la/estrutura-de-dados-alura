package site.camila.cursoalura.estruturadedados.listasligadas.classes;

public class Celula {
	private Object elemento;
	
	private Celula anterior;
	private Celula proximo;
	
	public Celula(Object elemento) {
		this(null, elemento);
	}
	
	public Celula(Celula proxima, Object elemento) {
		this.proximo = proxima;
		this.elemento = elemento;
	
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}
	
	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return String.valueOf(this.getElemento());
	}
	
	
}
