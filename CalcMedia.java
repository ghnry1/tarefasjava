package Entidades;

public class CalcMedia {

	public String nome;
	public double nota;
	public double nota2;
	public double nota3;
	
	public double CalcMedia1() {
		return nota + nota2 + nota3;
	}
	public double CalcAprovacao() {
		if(CalcMedia1() < 60) {
			return CalcMedia1() - 60;
		}else {
			return 0.0;
		}
		
	}
	
	
}
