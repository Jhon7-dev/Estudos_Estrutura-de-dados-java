package com.joao.estruturadados.vetor.pilha;

import com.joao.estruturadados.vetor.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	public Pilha() {
		// TODO Auto-generated constructor stub
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		// this.aumentaCapacidade();
		 this.elementos[tamanho] = elemento;
		 tamanho++;
		//super.adiciona(elemento);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < tamanho; i++) {
			sb.append(elementos[i]);
			if (i < tamanho - 1) {
				sb.append(", ");
			}
		}
		sb.append("] <- topo");
		return sb.toString();
	}

}
