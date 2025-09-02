package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		System.out.print(vetor.getTamanho()+"\n");
		System.out.print(vetor.toString());
	}

}
