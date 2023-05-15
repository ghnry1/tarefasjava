package execut.constr;

import java.util.Scanner;

import execut.aplic.Aluno;

public class ProgramaNotaAluno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		 * Aluno [] alunos = new Aluno [2];
		 * 
		 * alunos [0] = new Aluno (); alunos[0].setNome("José");
		 * alunos[0].setMatricula(1020); alunos[0].setN1(8); alunos[0].setN2(5);
		 * alunos[0].setN3(9); alunos[0].setN4(3);
		 * 
		 * alunos[1] = new Aluno("Maria", 1030, 8, 9, 10, 10);
		 */

		System.out.println("Quantos alunos serão cadastrados? ");
		int qtd = in.nextInt();
		Aluno[] alunos = new Aluno[qtd];

		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno();
			System.out.println("Qual seu nome? ");
			alunos[i].setNome(in.next());
			System.out.println("Qual sua matricula?");
			alunos[i].setMatricula(in.nextInt());
			System.out.println("Qual sua N1? ");
			alunos[i].setN1(in.nextDouble());
			System.out.println("Qual sua N2? ");
			alunos[i].setN2(in.nextDouble());
			System.out.println("Qual sua N3? ");
			alunos[i].setN3(in.nextDouble());
			System.out.println("Qual sua N4? ");
			alunos[i].setN4(in.nextDouble());
		}
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("\n" + alunos[i]);

		}

		in.close();
	}

}
