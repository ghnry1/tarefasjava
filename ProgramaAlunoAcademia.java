package Aplicações;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.AlunoAcademia;

public class ProgramaAlunoAcademia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<AlunoAcademia> aluno = new ArrayList<>();
		AlunoAcademia ii = new AlunoAcademia();
		int opc = 0;

		do {
			System.out.println("Bem-vindo a nossa academia!");
			System.out.println(
					"1- Cadastrar aluno" + "\n2 - relatorio de nomes" + "\n3 - relatorio geral" + "\n9 - sair");
			opc = in.nextInt();

			switch (opc) {
			case 1:

				System.out.println("Digite a identificação:");
				int identificacao = in.nextInt();
				System.out.println("Digite o nome:");
				String nome = in.next();
				System.out.println("Digite o peso:");
				double peso = in.nextDouble();
				System.out.println("Digite a altura:");
				double altura = in.nextDouble();
				System.out.println("Digite a idade:");
				int idade = in.nextInt();
				aluno.add(new AlunoAcademia(identificacao, nome, peso, altura, idade, identificacao));
				continue;
			case 2:
				for (int i = 0; i < aluno.size(); i++) {
					System.out.println(aluno.get(i).getNome() + "\n");
				}
				continue;
			case 3:
				for (int i = 0; i < aluno.size(); i++) {
					System.out.println("\n" + aluno.get(i) + "\n");
				}
				continue;
			case 9:
				System.out.println("Até mais!");
				continue;
			default:
				System.out.println("Opção inválida!");

			}
		} while (opc != 9);

		in.close();
	}

}
