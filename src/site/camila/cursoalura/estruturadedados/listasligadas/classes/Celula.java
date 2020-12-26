package site.camila.cursoalura.estruturadedados.listasligadas.classes;

public class Celula {
	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
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
	
	@Override
	public String toString() {
		return String.valueOf(this.getElemento());
	}
	
	
}
