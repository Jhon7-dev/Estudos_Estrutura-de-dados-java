package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Vetor vetor = new Vetor(10);

	//	vetor.adiciona("JAVA");
	/*	vetor.adiciona("CSS");
		vetor.adiciona("java");
		vetor.adiciona("python");
        System.out.println(vetor);
        
        System.out.println("Remover o elemento Java");
        
        int pos = vetor.busca("java");
        if(pos >= - 1) {
        	vetor.remove(pos);
        }else {
        	System.out.println("elemento não existe no vetor");
        }
        System.out.println(vetor);*/
		
		
		
		Vetor vetor = new Vetor(5);
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println(vetor);
		vetor.remove(3);
		System.out.println(vetor);

/*		System.out.println("Remover o elemento E  ");
		int pos = vetor.busca("E");
		if(pos>=0) {
			vetor.remove(pos);
		}
		System.out.println(vetor);*/
	}
}
