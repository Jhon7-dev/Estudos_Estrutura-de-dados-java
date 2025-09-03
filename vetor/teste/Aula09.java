package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(10);

		vetor.adiciona("JAVA");
		vetor.adiciona("CSS");
		vetor.adiciona("HTML");
		vetor.adiciona("C++");
		vetor.adiciona("C#");
		vetor.adiciona("PYTHON");
		vetor.adiciona("SQL");
		vetor.adiciona("GO");
		vetor.adiciona("C");
		vetor.adiciona("JAVA SCRIPT");
		// vetor.adiciona("");
		// vetor.adiciona("");

		System.out.println(vetor);

		vetor.remove(1);

		System.out.println(vetor);

		vetor.remove(5);

		System.out.println(vetor);

		int pos = vetor.busca("JAVA");
		if (pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(vetor);
	}

}
