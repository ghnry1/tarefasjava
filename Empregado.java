package Entidades;

public class Empregado {
	private int id;
	private String nome;
	private double salario;

	public Empregado() {

	}

	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentoSalario(double porcentagem) {
   salario += (salario*porcentagem/100);
	}

	@Override
	public String toString() {
		return "Empregado [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
		//return "O empregado de id: " + id + " tem o salario R$: " + salario + "nome: " + nome;
	}
	
	
	

}
