package Entidades;

public class Eventos {

	private int codigo;
	private String titulo;
	private String local;
	private String data;
	private String hora;
	private int qtdLugares;
	private int qtdlugaresvendidos;
	private double valoringresso;
	private String status;
	private static final double VALOR_DEFAULT_INGRESSO = 100;
	private static int proximoCodigo = 1;
    private static final int QTD_CAPACIDADE_DEFAULT = 3000;
	private static final int QTD_INGRESSOS_VENDA_DEFAULT = 2;
    public Eventos() {
		super();
		this.codigo= proximoCodigo++;
		this.valoringresso = VALOR_DEFAULT_INGRESSO;
		this.qtdLugares = QTD_CAPACIDADE_DEFAULT;
		this.status = "Venda não iniciada";
	}

	public Eventos(int codigo, String titulo, String local, String data, String hora) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.local = local;
		this.data = data;
		this.hora = hora;
		this.qtdLugares = QTD_CAPACIDADE_DEFAULT;
		this.qtdlugaresvendidos = QTD_INGRESSOS_VENDA_DEFAULT;
		this.valoringresso = valoringresso;
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
		return qtdLugares;
	}

	public void setQtdlugares(int qtdlugares) {
		this.qtdLugares = qtdlugares;
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

	public void vendas(int quantidade) {
		if(status.equals("Vendas iniciadas") && qtdlugaresvendidos + quantidade <= qtdLugares) {
			qtdlugaresvendidos += quantidade;
			System.out.println("Venda realizada!");
		}else {
			System.out.println("Não foi possível realizar a venda.");
		}
		
	}
	public void vendas() {
		 vendas(QTD_INGRESSOS_VENDA_DEFAULT);
	}
	public int qtdlugareslivres(int qtdlugares) {
		return qtdlugares-qtdlugaresvendidos;
	}
	public void iniciarvenda() {
			if(status.equals("Vendas não iniciadas")) {
				status = "Vendas iniciadas";
				System.out.println("As vendas para o ingresso foram iniciadas.");
			}else {
				System.out.println("As vendas já foram iniciadas ou encerradas.");
			}
			}
	public void finalizarvenda() {
		if(status.equals("Vendas iniciadas")) {
			status = "Vendas finalizadas.";
		System.out.println("As vendas do evento foram finalizadas.");
		}else {
			System.out.println("As vendas não foram iniciadas ou já foram finalizadas.");
		}
	}
	public void cancelarevento() {
		if(!status.equals("Evento cancelado")) {
    		status = "Evento cancelado";
    		}else {
    			System.out.println("O evento foi cancelado.");
    		}
	}
    public void eventoocorrido() {
    	if(!status.equals("Evento cancelado.") && !status.equals("Evento ocorrido.")){
    		status = "Evento ocorrido.";
    		System.out.println("Evento já ocorreu.");
    	}else {
    		System.out.println("O evento foi cancelado ou já ocorreu.");
    	}
    }
}
