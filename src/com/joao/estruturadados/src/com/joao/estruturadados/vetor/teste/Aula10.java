package com.joao.estruturadados.vetor.teste;

import com.joao.estruturadados.vetors.VetorObject;

public class Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		System.out.println("tamanho = " + vetor.getTamanho());
		System.out.println(vetor);*/
		VetorObject vetor = new VetorObject(3);
		Contato c1 = new Contato("Contato 1","joaovict27@icloud.com","(21)96991-0906");
		Contato c2 = new Contato("Contato 2","leleDeJava@gmail.com","(15)97909-7453");
		Contato c3 = new Contato("Contato 3","javascript@icloud.com","(21)98190-1267");
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		System.out.println(vetor);
		
		int posicao = vetor.busca(c1);{
			if(posicao>-1) {
				System.out.println("elemento existe no vetor");
			}else {
				System.out.println("elemento nao existe");
			}
		}
	}

}
