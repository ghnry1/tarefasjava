package Entidades;

public class Eventos {

	private int codigo;
	private String titulo;
	private String local;
	private String data;
	private String hora;
	private int qtdlugares;
	private int qtdlugaresvendidos;
	private double valoringresso;
	private String status;
	private static final double VALOR_DEFAULT_INGRESSO = 100;
	private static final int QTD_CAPACIDADE_DEFAULT = 3000;
	private static final int QTD_INGRESSOS_VENDA_DEFAULT = 2;

	public Eventos() {
		
	}

	public Eventos(int codigo, String titulo, String local, String data, String hora) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.local = local;
		this.data = data;
		this.hora = hora;
		this.qtdlugares = QTD_CAPACIDADE_DEFAULT;
		this.qtdlugaresvendidos = qtdlugaresvendidos;
		this.valoringresso = VALOR_DEFAULT_INGRESSO;
		this.status = "Venda não iniciada";
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
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


	public void vendas(int qtdlugaresvendidos) {
		if(status.equalsIgnoreCase("Venda iniciada")&& qtdlugares <= QTD_CAPACIDADE_DEFAULT) {
			qtdlugares-=qtdlugaresvendidos;
			qtdlugaresvendidos += qtdlugaresvendidos;
			System.out.println("Venda realizada.");
			
			System.out.println("Foram comprados " + qtdlugaresvendidos + " ingressos.");
		}else {
			System.out.println("A venda não pode ser realizada.");
		}
	}

	public void Qtdlugareslivres(int Qtdlugaresvendidos) {
		int Qtdlugareslivres = qtdlugares -= qtdlugaresvendidos; 
		System.out.println("Ainda têm " + Qtdlugareslivres + " lugares livres.");
	}

	public void iniciarvenda() {
		if(!status.equals("Vendas iniciadas") && qtdlugaresvendidos <= qtdlugares) {
			status = "Vendas iniciadas";
			System.out.println("Vendas iniciadas.");
		}else {
			System.out.println("As vendas já foram iniciadas ou finalizadas.");
		}
			
		
	}

	public void finalizarvenda() {
		if(status.equals("Vendas iniciadas")) {
			status = "Vendas encerradas";
			System.out.println("Vendas encerradas.");
		}else {
			System.out.println("As vendas não foram iniciadas ou já foram encerradas.");
		}
		
	}

	public void cancelarevento() {
	if(!status.equals("Evento cancelado")) {
			this.status = "Cancelado";
			System.out.println("O evento foi cancelado.");
		}else {
			System.out.println("O evento já está cancelado.");
		}
		
	}

	public void eventoocorrido() {
		if (!status.equals("Evento cancelado") && !status.equals("Evento ocorrido")) {
			status = "Evento ocorrido";
			System.out.println("Evento já ocorreu.");
		}else {
			System.out.println("O evento já foi cancelado ou já ocorreu.");
		}
		
	}

	@Override
	public String toString() {
		return "\nO código é: " + codigo + ".\no título é: " + titulo + ".\no local é: " + local + ".\na data é: " + data
				+ ".\na hora é: " + hora + ".\na quantidade de lugares livres é: " + qtdlugares
				+ ".\na quantidade de lugares vendidos é: " + qtdlugaresvendidos + ".\no valor do ingresso é: "
				+ valoringresso + ".\no status do evento é: " + status + ".\n";
	}

}
