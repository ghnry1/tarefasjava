package Entidades;

public class BancoConstrutores {
    public String nomedc;
   public double ndc;
    public double valordi;
	public int resposta;
	public double deposito;
	public double saque;
	public double dadosdc;
	public int senha;
	public int taxa = (int) ((valordi - saque) - 5);
	public String getNomedc() {
		return nomedc;
	}
	public void setNomedc(String nomedc) {
		this.nomedc = nomedc;
	}
	public double getNdc() {
		return ndc;
	}
	public void setNdc(double ndc) {
		this.ndc = ndc;
	}
	public double getValordi() {
		return valordi;
	}
	public void setValordi(double valordi) {
		this.valordi = valordi;
	}
	public int getResposta() {
		return resposta;
	}
	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public double getDadosdc() {
		return dadosdc;
	}
	public void setDadosdc(double dadosdc) {
		this.dadosdc = dadosdc;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getTaxa() {
		return taxa;
	}
	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}
		
	
}
