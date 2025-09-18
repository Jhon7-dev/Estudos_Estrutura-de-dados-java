package com.joao.estruturadados.vetors;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade]; // capacidade é o tamanho do vetor
		this.tamanho = 0; // é o topo
	}

	// Aula-03
	// Adicionar elementos

	public void adiciona(String elemento) {
		this.aumentaCapacidade();
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho++;
				break;
			}
		}
	}
	 
	// Aula 04
	// Imprimir todos os membros do vetor

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

	// Aula05
	// Obter elementos de uma posição
	
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida: " + posicao);
		}
		return elementos[posicao];
	}

	// Aula 06
	// Verificar se o elemnto existe (busca sequencial)
	
	public int busca(String elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return tamanho;
	}

	// Aula 07
	// Adiciona Elemento em qualquer posição
	
	public void adiciona(int posicao, String elemento) {
		this.aumentaCapacidade();
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = tamanho - 1; i >= posicao; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		this.tamanho++;
	}

	// Aula 08
	// Aumentar a capacidade do vetor
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i = 0;i<this.elementos.length;i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	// Remover Elemento

	// B G D E F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4 -> TAMANHO É 5
	// vetor[1] = vetor [2]
	// vetor[2] = vetor [3]
	// vetor[3] = vetor [4]

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public int getTamanho() {
		return this.tamanho;
	}

}


