package com.joao.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho++;
				break;
			}
		}
	}
	public int getTamanho() {
		return this.tamanho;
	}
	public 
}
