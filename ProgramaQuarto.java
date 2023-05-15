package Aplicações;

import java.util.Scanner;

import Entidades.Quartos;

public class ProgramaQuarto {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Quartos ii = new Quartos();
		System.out.println("                  Sejam bem-vindos!");
		System.out.println("Digite a quantidade de estudantes que irão alugar os quartos:");
		int n = in.nextInt();
		

		 Quartos[] p1 = new Quartos[10]; 
		 /*for (int i = 0; i < n; i++) {
		 * System.out.println("Qual quarto você vai escolher?"); int quarto =
		 * in.nextInt();
		 * 
		 * System.out.println("Qual seu nome?"); String nome = in.next();
		 * 
		 * System.out.println("Qual seu email?"); String email = in.next();
		 * 
		 * p1[i] = new Quartos(nome, email, quarto);
		 * 
		 * } for (int i = 0; i < n; i++) { if (p1[i].getQuarto() <= 10) {
		 * System.out.println("Seu quarto é o: #" + p1[i].getQuarto() + ", Seu nome: " +
		 * p1[i].getNome() + ", Seu email: " + p1[i].getEmail()); } }
		 */
		
		for(int i = 0; i< n; i++) {
			
			System.out.println("Qual quarto você desejaria ficar hospedado?");
			int escolha = in.nextInt();
			System.out.println("Qual o nome do hospede?");
			p1[escolha].setNome(in.next());
			System.out.println("Qual o email do hospede?");
		p1[escolha].setEmail(in.next());
		}
		int i = 0;
		for(Quartos q: p1) {
			if(q != null){
				System.out.println("Seu quarto é o: #" + p1[i].getQuarto() + ", Seu nome: " +
						  p1[i].getNome() + ", Seu email: " + p1[i].getEmail());
			}
		}
		in.close();
	}
}
