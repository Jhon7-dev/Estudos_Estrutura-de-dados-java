package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("curso");
		vetor.adiciona("Estrutura de Dados");
		//vetor.adiciona("elemento 3");
		System.out.println("Tamanho do vetor: ");
		System.out.print(vetor.getTamanho() + "\n");
		System.out.println("Elementos do Vetor: ");
		System.out.println(vetor.toString());
	}

}
