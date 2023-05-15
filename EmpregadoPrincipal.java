package Aplicações;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import Entidades.Empregado;

public class EmpregadoPrincipal {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	List<Empregado> empregado = new ArrayList<>();
	
	System.out.println("Quantos funcionários?");
	int qtd = in.nextInt();
	
	for(int i = 0; i< qtd; i++){

		System.out.println("Qual seu nome?");
		String nome = in.next();
		System.out.println("Qual seu id?");
		int id = in.nextInt();
		System.out.println("Qual seu salário?");
		int salario = in.nextInt();
		
		empregado.add(new Empregado(id, nome, salario));
		}
	System.out.println("Qual funcionario você quer que tenha um aumento, informe seu id:");
	int id = in.nextInt();
	for(int i = 0; i< qtd; i++) {
		if(empregado.get(i).getId()==id) {
			System.out.println("Qual a porcentagem do aumento?");
			empregado.get(i).aumentoSalario(in.nextDouble());
		
		}else {
			System.out.println("Funcionario não encontrado.");
		}
			
		
		
	}
	
	
	 for(Empregado emp : empregado) {
		System.out.println(emp); 
	}

	 
	
	}

}
