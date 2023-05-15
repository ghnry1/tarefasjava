package Aplicações;

import java.util.Scanner;

import Entidades.Retangulo;

public class aula3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Retangulo ret = new Retangulo();

		System.out.println("                                          Programa pra calcular as medidas de um retângulo.");
		System.out.println( );
		System.out.println("Digite a medida da base do retangulo: ");
		ret.b = in.nextDouble();
		System.out.println("Digite a medida da altura: ");
		ret.h = in.nextDouble();
		double a = ret.CalcArea();
		System.out.println("A área do retângulo é: " + a + ".");
		double p = ret.CalcPerimetro();
		System.out.println("O peímetro do retângulo é: " + p + ".");
		double d = ret.Calcdiagonal(); 
		System.out.println("A diagonal do retângulo é: " + d + ".");
		in.close();
	}

}
