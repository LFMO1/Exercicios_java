package Lista;

public class Lista3 {
	protected int v[];
	protected int fim = 0;

	public Lista3() {
		this(12);
	}

	public Lista3(int tam) {
		v = new int[tam];
	}

	public void adicionar(int elem) {
		// utiliza m�todo inserir existente!
		inserir(fim, elem);
		// adi��o=inser��o no fim!
	}

	public int capacidade() {
		return v.length;
	}

	public boolean cheia() {
		return fim == v.length;
	}

	public int comprimento() {
		return fim;
	}

	public int elemento(int pos) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inv�lida");
		}
		return v[pos];
	}

	public void inserir(int pos, int elem) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inv�lida");
		} else if (fim == capacidade()) {
			throw new RuntimeException("lista cheia");
		}
		fim++;
		for (int i = fim - 1; i > pos; i--) {
			v[i] = v[i - 1];
		}
		v[pos] = elem;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		for (int i = 0; i < fim; i++) {
			sb.append(v[i]);
			sb.append(" ");
		}
		sb.append("]");
		return sb.toString();
	}

	public boolean vazia() {
		return fim == 0;
	}
	
	public int remover(int pos) {
		if(vazia()) {
			throw new RuntimeException("lista vazia");
			}Object aux= elemento(pos);
			
			for (int i = pos+ 1; i < fim; i++) {v[i -1] = v[i];}fim--;
			return (int) aux;
			}


}
