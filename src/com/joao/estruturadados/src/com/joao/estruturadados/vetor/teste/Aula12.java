package com.joao.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		ArrayList<String>arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		System.out.println(arrayList);
		
		arrayList.add(2, "po");
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("elemento existe no array");
		}else {
			System.out.println("não existe no array");
		}
		int pos = arrayList.indexOf("A");//encontrar a posição (índice) de um elemento dentro de um array.
		if(pos>-1) {
			System.out.println("Elemento existe no array na posição " + pos );
		}else {
			System.out.println("Elemento não existe no array");
		}
		System.out.println(arrayList.get(4)); // busca por posição no arrayList
		arrayList.remove(2); // remove o elemento do vetor
		System.out.println(arrayList);
		System.out.println(arrayList.size());
	}
	

}
