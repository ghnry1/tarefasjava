package Aplicações;

import java.util.Scanner;

public class atividade2403 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Quantos números você vai digitar? (Menor que 10)");
//		int n = in.nextInt();
//		int[] numero = new int[n];
//		if (n > 10) {
//			System.out.println("ERRO.");
//		} else {
//			for (int i = 0; i < n; i++) {
//				System.out.println("Digite um número:");
//				numero[i] = in.nextInt();
//
//			}
//			System.out.println("NUMEROS NEGATIVOS:");
//			for (int i = 0; i < n; i++) {
//
//				if (numero[i] < 0) {
//
//					System.out.println(numero[i]);
//				}
//			}
//		}

//002		

		System.out.println("Quantos números você vai digitar?");
		double n = in.nextDouble();
		double[] numero = new double[(int) n];
		double soma = 0;
		double media = 0;
		for (double i = 0; i < n; i++) {
			System.out.println("Digite um número:");
			numero[(int) i] = in.nextDouble();

		}
		System.out.println("VALORES:");
		for (double i = 0; i < n; i++) {
			System.out.println(numero[(int) i]);

		}
		for (double i = 0; i < n; i++) {
			System.out.println("SOMA: " + soma + numero[(int) i]);

		}
		in.close();

	}

}
