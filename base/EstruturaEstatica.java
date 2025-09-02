package com.joao.estruturadados.base;

public class EstruturaEstatica<T> {
	private T[] elementos;
	private int tamanho;
	
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
}
