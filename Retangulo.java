package Entidades;

public class Retangulo {
	public double h;
	public double b;
    
    public double CalcArea()  {
    	return h * b;
    	// h = altura. b = base.
     }
     public double CalcPerimetro() {
    	 return b + b + h + h;
     }
     public double Calcdiagonal() {
    	 return Math.sqrt((b*b) + (h*h));
     }
	
	
}
