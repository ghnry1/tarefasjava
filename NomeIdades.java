package Entidades;

import java.util.Scanner;

public class NomeIdades {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantas pessoas são?");
		int qtdp = in.nextInt();
		String n[] = new String[qtdp];
		int id[] = new int[qtdp];
		for (int i = 0; i < qtdp; i++) {
			System.out.println("Digite o nome e a idade da pessoa N°" + (i+1) + ": ");
			n[i] = in.next();
			id[i] = in.nextInt();

		}
		System.out.println("As pessoas são: ");
		for (int i = 0; i < qtdp; i++) {

			System.out.println(n[i]);
		}
		for (int i = 0; i < qtdp; i++) {

			if (id[i] < 18) {
				System.out.println("É menor de idade: " + n[i]);

			}

		}

		in.close();
	}
}
