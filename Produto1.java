package Entidades;

public class Produto1 {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto1(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}
	public Produto1(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto1() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreso(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade ( int quantidade) {
		this.quantidade = quantidade;
	}
	
	

	public void AddProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public double valortotal() {
		return preco * quantidade;
	}

	public void RemoveProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public double ValorTotal() {
		return preco * quantidade;
	}

}