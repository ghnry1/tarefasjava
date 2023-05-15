package Entidades;

public class AlunoAcademia {
	private int identificacao;
	private String nome;
	private double peso;
	private double altura;
	private double idade;
	private double imc;
	public AlunoAcademia() {
		
	}
	public AlunoAcademia(int identificacao, String nome, double peso, double altura, int idade, double imc) {
		this.identificacao = identificacao;
		this.nome = nome;
		this.peso = peso;
		this.altura= altura;
		this.idade = idade;
		this.imc = imc;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getIdade() {
		return  idade;
	}
	public void setIdade(double idade) {
		this.idade = idade;
	}
	
	public double getImc() {
		return imc = getPeso()/(getAltura()*getAltura());
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	@Override
	public String toString() {
		return "O aluno: " + nome +
				"\ntem: " + idade + " anos " +
				"\no ID é: " + identificacao +
				"\na altura é: " + altura +
				"\no peso é: " + peso +
				"\no seu IMC é: " + imc;
	}
	
	}
	

