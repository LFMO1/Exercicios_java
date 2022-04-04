package PIlha;

public class Pilha2 {
	private int[] elemento;
	private int topo = 0;
	
	public Pilha2() {
		this(15);
	}
	
	public Pilha2(int tamanho) {
		elemento = new int[tamanho];
	}

	public void adicionar(int valor) {
		if (topo < elemento.length) {
			elemento[topo] = valor;
			topo++;
		} else {
			throw new RuntimeException("Pilha cheia");
		}
	}

	public int capacidade() {
		return elemento.length;
	}
	
	public boolean cheia() {
		return topo == elemento.length;
	}
	
	public int comprimento() {
		return topo;
	}
	
	public int elemento(int pos) {
		if (pos < topo && pos > -1) {
			return elemento[pos];
		} else {
			throw new RuntimeException("Posição inválida");
		}
	}
	
	public int remover() {
		if (topo > 0) {
			topo--;
			return elemento[topo];
		} else {
			throw new RuntimeException("Pilha vazia");
		}
	}
	
	public String toString() {
		String texto = "[ ";
		for (int i = 0; i < topo; i++) {
			texto += elemento[i];
			texto += " ";
		}
		texto += "] : ";
		texto += topo;
		return texto;
	}
	
	public boolean vazia() {
		return topo == 0;
	}


}
