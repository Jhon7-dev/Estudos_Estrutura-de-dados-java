package com.joao.estruturadados.vetor.labs;

import com.joao.estruturadados.vetors.Lista;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista <String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		//lista.adiciona("F");
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));
		System.out.println(lista);
	}

}
