package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetors.VetorObject;

public class Aula11 {
	public static void main(String[] args) {
		VetorObject vetor = new VetorObject(2);
		
		vetor.adiciona(1);
		vetor.adiciona("elemento simples do tipo String");
		System.out.println(vetor);
	}
}
