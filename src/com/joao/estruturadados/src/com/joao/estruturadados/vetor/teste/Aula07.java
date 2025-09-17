package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetors.Vetor;

public class Aula07 {
	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
	//	vetor.adiciona("");
	//	vetor.adiciona("");
	//	vetor.adiciona("");
	//	vetor.adiciona("");
		System.out.println(vetor);
		
		vetor.adiciona(0,"A");
		
		System.out.println(vetor);
		
		vetor.adiciona(5, "R");
		
		System.out.println(vetor);

		
		
	}
}
