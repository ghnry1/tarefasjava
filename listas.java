package Resolucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>(); // declara uma lista do tipo array

		// lista.add(10);// adiciona itens a lista
		// System.out.println(lista.indexOf(10)); // mostra a posição do item na lista
		// lista.remove(0); // remove o item da lista
		// lista.remove(lista.indexOf(10)); // aqui eu uso o valor
		// System.out.println(lista.get(0)); // pega o item na posição desejada

		/*
		 * for (int i = 0; i < 100; i++) { lista.add(i);
		 * System.out.println(lista.get(i)); } System.out.println("\n" +
		 * "Os pares são: "); for (int i = 0; i < lista.size(); i++) { if(i % 2 == 0){
		 * System.out.println(i);
		 * 
		 * } }
		 */

		/*
		 * String opcao = ""; while (!opcao.equalsIgnoreCase("Sim")) {
		 * System.out.println("Você deseja sair? "); opcao = in.next();
		 * if(opcao.equalsIgnoreCase("Sim")) { System.out.println("Ok.");
		 * 
		 * } }
		 */

		/*
		 * System.out.println("Gostaria de " + "responder uma pergunta: "); String opcao
		 * = in.next(); if(!opcao.equalsIgnoreCase("Sim")) { System.out.println("OK.");
		 * } while (opcao.equalsIgnoreCase("Sim")) {
		 * System.out.println("Você deseja continuar? "); opcao = in.next();
		 * if(!opcao.equalsIgnoreCase("Sim")) { System.out.println("Ok.");
		 * 
		 * } }
		 */

		int opc = 0;
		do {
			System.out.println("Bem-vindo a nossa academia!");
			System.out.println(
					"1- Cadastrar aluno" + "\n2 - relatorio de nomes" + "\n3 - relatorio geral" + "\n9 - sair");
			opc = in.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Você vai cadastrar o aluno aqui: \n");
				continue;
			case 2:
				System.out.println("Você vai ter um relatório de nomes: \n");
				continue;
			case 3:
				System.out.println("Você vai ter o relatório geral: \n");
				continue;
			case 9:
				System.out.println("Hasta la vista! ");
				continue;
			default:
				System.out.println("Opção inválida. \n" );
				continue;
			}
		} while (opc != 9);

	}

}
