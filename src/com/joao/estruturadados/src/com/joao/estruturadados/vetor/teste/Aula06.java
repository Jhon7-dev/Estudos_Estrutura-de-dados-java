package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetors.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(10);

		vetor.adiciona("java");// posicao 1
		vetor.adiciona("python");// posicao 2
		vetor.adiciona("html");// posicao 3
		vetor.adiciona("css");// posicao 4
		
	
		System.out.print("Busca elemento 'Java': ");
		System.out.println(vetor.busca("java"));
		
		System.out.print("Busca elemento 'Python': ");
		System.out.println(vetor.busca("python"));
		
		System.out.print("Busca elemento 'Html': ");
		System.out.println(vetor.busca("html"));
	}

}
