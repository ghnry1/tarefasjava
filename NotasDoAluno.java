package Aplicações;

import java.util.Scanner;

import Entidades.CalcMedia;



public class NotasDoAluno {

	public static void main(String[] args) {
	Scanner in = new Scanner( System.in);
	CalcMedia nota = new CalcMedia();
	
	System.out.println("Qual o seu nome: ");
	nota.nome=in.next();
	System.out.println("Digite as notas dos 3 primeiros bimestres: ");
	nota.nota = in.nextDouble();	
	nota.nota2 = in.nextDouble();
	nota.nota3 = in.nextDouble();	
	
	if(nota.CalcMedia1() > 60) {
		System.out.println("Você foi aprovado!!");
	}else {
		System.out.println("Você não foi aprovado, \nfaltou: " + nota.CalcAprovacao()*-1 + " pontos. ");
	}
	in.close();
	}

}
