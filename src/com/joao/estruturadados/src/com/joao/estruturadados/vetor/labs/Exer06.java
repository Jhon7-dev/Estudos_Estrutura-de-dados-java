package com.joao.estruturadados.vetor.labs;

import java.util.Scanner;

import com.joao.estruturadados.vetor.teste.Contato;
import com.joao.estruturadados.vetors.Lista;

public class Exer06 {
	// 1-criar um menu para que o usuário escolha a op
	//
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Lista<Contato> lista = new Lista<Contato>(10);
		criarContatosDinamicamente(3, lista);
		int opcao = 1;
		while (opcao != 0) {
			obterOpcaoMenu(scn);
			
		}
		
		System.out.println("Usuário digitou 0 programa terminado. ");
		System.out.println("Encerrando programa.........");
		System.out.println("Programa encerrado com sucesso!");

	}

	private static int obterOpcaoMenu(Scanner scn) {
		String entrada;
		boolean entradaValida = false;
		int opcao = 0;
		while (!entradaValida) {

			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Busca contato de uma posição específica");
			System.out.println("4: Consulta contato ");
			System.out.println("5: Consulta ultimo índice de  contato ");
			System.out.println("6: Verifica se o contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Exclui os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");
			System.out.print("Digite a opção: ");

			try {
				entrada = scn.nextLine();
				opcao = Integer.parseInt(entrada);
				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					System.out.println("Entrada inválida, digite novamente");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida!");
				System.out.println("Digite novamente");
			}

		}
		return 0;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTefone("(21)9743-0904 " + i);
			contato.setTefone("contato " + i + "@email.com");

			lista.adiciona(contato);

		}

	}
}
