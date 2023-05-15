package Aplicações;

import java.util.Scanner;

import Entidades.Produto1;

public class ProdutoEstoque {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite as informações do produto: ");
		System.out.println("Nome: ");
		String nome = in.next();
		System.out.println("Preço: ");
		double preco = in.nextDouble();
//		System.out.println("Quantidade: ");
//		prod.quantidade = in.nextInt();
		Produto1 prod = new Produto1(nome, preco);
		System.out.println("Informações atualizadas: " + prod.getNome() + "." + "\nQuantidade: " + prod.getQuantidade()
				+ "." + " \nValor Total: R$ " + prod.ValorTotal());
		System.out.println("Digite uma quantidade a ser adicionada: ");
		int quant = in.nextInt();
		prod.AddProduto(quant);
		System.out.println("Informações atualizadas: " + prod.getNome() + ".");
		System.out.println("Quantidade: " + prod.getQuantidade() + ".");
		System.out.println("Valor Total: R$ " + prod.ValorTotal() + ".");
		System.out.println("Digite uma quantidade a ser removida: ");
		quant = in.nextInt();
		prod.RemoveProduto(quant);
		System.out.println("Informações Atualizadas: " + prod.getNome() + ".");
		System.out.println("Quantidade: " + prod.getQuantidade() + ".");
		System.out.println("Valor total: R$ " + prod.ValorTotal() + ".");

		in.close();
	}
}
