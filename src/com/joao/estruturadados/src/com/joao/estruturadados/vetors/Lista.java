package com.joao.estruturadados.vetors;

import java.lang.reflect.Array;

public class Lista <T> {
	private T[] elementos;
	private int tamanho;
 
	public Lista(int capacidade,Class<T>tipoClasse) {
		this.elementos =(T[])Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0; // é o topo
	}
	
	// Aula-03
	// Adicionar elementos

	public void adiciona(T elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho++;
				break;
			}
		}
	}
	// Aumentar a capacidade do vetor
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T [] elementosNovos = (T[]) new Object [this.elementos.length * 2];
			for(int i = 0;i<this.elementos.length;i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	// Obter elementos de uma posição

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida: " + posicao);
		}
		return elementos[posicao];
	}

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

	// Verificar se o elemnto existe (busca sequencial)
	public int busca(T elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return tamanho;
	}

	// Adiciona Elemento em qualquer posição
	public void adiciona(int posicao, Object elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = tamanho - 1; i >= posicao; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		this.tamanho++;
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
