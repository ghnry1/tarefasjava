package Entidades;

public class Eventos {
 private int codigo;
 private String titulo;
 private String local;
 private int data;
 private String hora;
 private int qtdlugares;
 private int qtdlugaresvendidos;
 private double valoringresso;
 private String status;
 
public Eventos() {
	super();
}
public Eventos(int codigo, String titulo, String local, int data, String hora, int qtdlugares, int qtdlugaresvendidos,
		double valoringresso, String status) {
	super();
	this.codigo = codigo;
	this.titulo = titulo;
	this.local = local;
	this.data = data;
	this.hora = hora;
	this.qtdlugares = qtdlugares;
	this.qtdlugaresvendidos = qtdlugaresvendidos;
	this.valoringresso = valoringresso;
	this.status = status;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getLocal() {
	return local;
}
public void setLocal(String local) {
	this.local = local;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public String getHora() {
	return hora;
}
public void setHora(String hora) {
	this.hora = hora;
}
public int getQtdlugares() {
	return qtdlugares;
}
public void setQtdlugares(int qtdlugares) {
	this.qtdlugares = qtdlugares;
}
public int getQtdlugaresvendidos() {
	return qtdlugaresvendidos;
}
public void setQtdlugaresvendidos(int qtdlugaresvendidos) {
	this.qtdlugaresvendidos = qtdlugaresvendidos;
}
public double getValoringresso() {
	return valoringresso;
}
public void setValoringresso(double valoringresso) {
	this.valoringresso = valoringresso;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
 public int vendas(int qtdlugaresvendidos) {
	 return qtdlugaresvendidos;
 }
 public int qtdlugareslivres(int qtdlugares) {
	 return qtdlugares;
 }
}
