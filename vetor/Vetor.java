package com.joao.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String [] elementosNovos = new String [ this.elementos.length * 2];
			for(int i = 0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho++;
				break;
			}
			this.aumentaCapacidade();
		}
	}
	public int getTamanho() {
		return this.tamanho;
	}
	
	public String busca(int posicao) {
		if(!(posicao>=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
		
	}
	public int busca(String elemento) {
		for(int i = 0;i<tamanho;i++) {
			if(elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao) {
		if(!(posicao>=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
	}
	
	public boolean adiciona(int posicao,String elemento) {
		
		if(!(posicao>=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		// mover todos os elementos
		for(int i = this.tamanho - 1; i>= posicao;i--) {
			this.elementos[i + 1] = this.elementos[i];
			break;
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		// i = 4
		this.aumentaCapacidade();
		return false;
	}

	//public boolean busca(String elemento) {
		//for(int i = 0; i < this.tamanho; i++) {
			//if(this.elementos[i].equals(elemento)) {
				//return true;
			//}
		//}
	//	return false;
	// }
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0;i<this.tamanho-1;i++) {
			s.append(elementos[i]);
			s.append(", ");
		}
		if(this.tamanho>0) {
			s.append(elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}
	
	
}
