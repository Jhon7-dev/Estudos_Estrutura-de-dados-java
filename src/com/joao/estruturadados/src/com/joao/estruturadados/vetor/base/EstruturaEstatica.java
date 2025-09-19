package com.joao.estruturadados.vetor.base;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0; // é o topo
	}

	public EstruturaEstatica() {
		this(10);
	}
	
	public boolean adiciona(T elemento) {
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	public boolean adiciona(int posicao,T elemento) {
		if(!(posicao>= 0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		this.aumentaCapacidade();
		for(int i = this.tamanho-1;i>=posicao;i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao]=elemento;
		this.tamanho++;
		return true;
		
	}
	
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	
	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(elementos[i]);
			s.append(",");
		}
		if (this.tamanho > 0) {
			s.append(elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
	}

}