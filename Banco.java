package Aplicações;

import java.util.Scanner;

import Entidades.BancoConstrutores;

public class Banco {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BancoConstrutores i = new BancoConstrutores();

		
		System.out.println("Bem-vindo!!!");
		System.out.println("Digite suas informações para abrir sua conta.");
		System.out.println("Nome do titular:");
		i.nomedc = in.next();
		System.out.println("Número da conta:");
		i.ndc = in.nextDouble();
		System.out.println("Digite uma senha de até 6 números:");
		i.senha = in.nextInt();
		System.out.println("Vocẽ quer depositar o saldo inicial?" + " \nDigite 1 para sim e 2 para não.");
		i.resposta = in.nextInt();
		if (i.resposta < 2) {
			System.out.println("Digite o valor que será depositado.");
			i.valordi = in.nextDouble();
			System.out.println("Titular: " + i.nomedc + "\nNúmero da conta é: " + i.ndc
					+ "\no valor inicial da sua conta é: R$" + i.valordi + ".");

		} else {
			System.out.println("O valor inicial da sua conta é R$ 0,00.");
			System.out.println("Digite sua senha para alterar o saldo da conta:");
			int sen = in.nextInt();
			if (sen == i.senha) {
				System.out.println("Se quiser fazer um depósito digite 1." + "\nDigite 2 caso queira fazer um saque.");
				int d = in.nextInt();
				if (d == 1) {
					System.out.println("Quanto você quer depositar?");
					int dd = in.nextInt();
					System.out.println("Titular: " + i.nomedc + "\nNúmero da conta é: " + i.ndc
							+ "\nPossui de saldo: R$" + i.valordi + dd + ".");
				}
				if (d == 2) {
					System.out.println("Quanto você quer retirar?");
					i.saque = in.nextInt();
					System.out.println("Titular: " + i.nomedc + "\nNúmero da conta é: " + i.ndc
							+ " \nPossui de saldo: R$" + ((i.valordi - i.saque) - 5) + ".");
				}
			} else {
				System.out.println("Sua senha está incorreta!!!");
			}

			System.out.println("Se quiser fazer um depósito digite 1." + "\nDigite 2 caso queira fazer um saque.");
		}
		System.out.println("Digite sua senha para alterar o saldo da conta:");
		int sen = in.nextInt();
		if (sen == i.senha) {
			System.out.println("Se quiser fazer um depósito digite 1." + "\nDigite 2 caso queira fazer um saque.");
			int d = in.nextInt();
			if (d == 1) {
				System.out.println("Quanto você quer depositar?");
				int dd = in.nextInt();
				System.out.println("Titular: " + i.nomedc + "\nNúmero da conta é: " + i.ndc + " \npossui de saldo: R$"
						+ i.valordi + dd + ".");
			}
			if (d == 2) {
				System.out.println("Quanto você quer retirar?");
				i.saque = in.nextInt();
				System.out.println("Titular: " + i.nomedc + "\nNúmero da conta é: " + i.ndc + " \npossui de saldo: R$"
						+ ((i.valordi - i.saque) - 5) + ".");
			}
		} else {
			System.out.println("Sua senha está incorreta!!!");
		}
		System.out.println("Você quer alterar seu nome?" + "\ndigite 1 para sim e 2 para não.");
		int nn = in.nextInt();
		if (nn == 1) {
			System.out.println("Digite seu nome: ");
			i.nomedc = in.next();
			System.out.println("O nome do titular agora é: " + i.nomedc + ".");
		} else {
			System.out.println("OK.");
		}
		System.out.println("Você gostaria de fazer alguma operação?" + "\ndigite 1 para sim e 2 para não.");
		int o = in.nextInt();
		while(o==1) {
			System.out.println("Digite sua senha para alterar o saldo da conta:");
			int sen1 = in.nextInt();
			if (sen1 == i.senha) {
				System.out.println("Se quiser fazer um depósito digite 1." + "\nDigite 2 caso queira fazer um saque.");
				int d = in.nextInt();
				if (d == 1) {
					System.out.println("Quanto você quer depositar?");
					int dd = in.nextInt();
					System.out.println("Titular: " + i.nomedc + "\nNúmero da conta é: " + i.ndc
							+ "\nPossui de saldo: R$" + i.valordi + dd + ".");
				}	
				if (d == 2) {
					System.out.println("Quanto você quer retirar?");
					i.saque = in.nextInt();
					System.out.println("Titular: " + i.nomedc + "\nNúmero da conta é: " + i.ndc
							+ " \nPossui de saldo: R$" + ((i.valordi - i.saque) - 5) + ".");
				}
			} else {
				System.out.println("Sua senha está incorreta!!!");
			}
		}
		System.out.println("OK.");
		in.close();
	}

}
