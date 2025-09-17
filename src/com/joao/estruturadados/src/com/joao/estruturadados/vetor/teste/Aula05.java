package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetors.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		 

		Vetor vetor = new Vetor(10);

		vetor.adiciona("java");// posicao 1
		vetor.adiciona("phyton");// posicao 2
		vetor.adiciona("html");// posicao 3
		vetor.adiciona("css");// posicao 4
		
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca(2));
		System.out.println(vetor.busca(3));
		
		
	}

}
