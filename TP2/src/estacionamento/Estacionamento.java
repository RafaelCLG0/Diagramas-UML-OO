package estacionamento;

import exceptions.DescricaoEmBrancoException;
import exceptions.ValorAcessoInvalidoException;

public class Estacionamento {

	private boolean aberto24h;

	private String tipoDeEstacionamento;

	private int capacidade;

	protected String horaDeAbrir, horaDeFechar;

	protected float descontoHora, contratante;

	protected int taxaDiaria, taxaNoturno, taxaFixaMensal, valorFracao;

	public Estacionamento(String tipoDeEstacionamento, String horaDeAbrir, String horaDeFechar, int capacidade,
			boolean aberto24h, float descontoHora, float contratante, int taxaDiaria, int taxaNoturno,
			int taxaFixaMensal, int valorFracao) {

		this.capacidade = capacidade;
		this.horaDeAbrir = horaDeAbrir;
		this.horaDeFechar = horaDeFechar;
		this.tipoDeEstacionamento = tipoDeEstacionamento;
		this.aberto24h = aberto24h;
		this.descontoHora = descontoHora;
		this.contratante = contratante;
		this.taxaDiaria = taxaDiaria;
		this.taxaNoturno = taxaNoturno;
		this.taxaFixaMensal = taxaFixaMensal;
		this.valorFracao = valorFracao;
	}

	public Estacionamento() {
	}

	public float getContratante() {
		return contratante;
	}

	public void setContratante(float contratante) {
		this.contratante = contratante;
	}

	public boolean isAberto24h() {
		return aberto24h;
	}

	public void setAberto24h(boolean aberto24h) {
		this.aberto24h = aberto24h;
	}

	public String getHoraDeAbrir() {
		return horaDeAbrir;
	}

	public void setHoraDeAbrir(String horaDeAbrir) {
		this.horaDeAbrir = horaDeAbrir;
	}

	public float getDescontoHora() {
		return descontoHora;
	}

	public void setDescontoHora(float descontoHora) {
		this.descontoHora = descontoHora;
	}

	public int getTaxaDiaria() {
		return taxaDiaria;
	}

	public void setTaxaDiaria(int taxaDiaria) {
		this.taxaDiaria = taxaDiaria;
	}

	public int getTaxaNoturno() {
		return taxaNoturno;
	}

	public void setTaxaNoturno(int taxaNoturno) {
		this.taxaNoturno = taxaNoturno;
	}

	public int getTaxaFixaMensal() {
		return taxaFixaMensal;
	}

	public void setTaxaFixaMensal(int taxaFixaMensal) {
		this.taxaFixaMensal = taxaFixaMensal;
	}

	public int getValorFracao() {
		return valorFracao;
	}

	public void setValorFracao(int valorFracao) {
		this.valorFracao = valorFracao;
	}

	public void setTipoDeEstacionamento(String tipoDeEstacionamento) {
		this.tipoDeEstacionamento = tipoDeEstacionamento;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void setHoraDeFechar(String horaDeFechar) {
		this.horaDeFechar = horaDeFechar;
	}

	public int getCapacidade() {
		return capacidade;
	}
	public String getHoraDeFechar() {
		return horaDeFechar;
	}

	public String getTipoDeEstacionamento() {
		return tipoDeEstacionamento;
	}

	public static Estacionamento criarEstacionamento (String tipoDeEstacionamento, String horaDeAbrir, String horaDeFechar, int capacidade, boolean aberto24h, float descontoHora, float contratante ,int taxaDiaria, int taxaNoturno, int taxaFixaMensal, int valorFracao)
			throws DescricaoEmBrancoException , ValorAcessoInvalidoException{
		if(tipoDeEstacionamento.equalsIgnoreCase("")||horaDeAbrir.equalsIgnoreCase("")||horaDeFechar.equalsIgnoreCase(""))
		{	throw new DescricaoEmBrancoException();
		}
		else if(capacidade <= 0 || descontoHora <= 0 || contratante <= 0 || taxaDiaria <= 0 || taxaNoturno <= 0 || taxaFixaMensal <= 0 || valorFracao <= 0) {	
		}

		Estacionamento estacio = new Estacionamento(tipoDeEstacionamento,horaDeAbrir,horaDeFechar,capacidade,aberto24h,descontoHora,contratante ,taxaDiaria,taxaNoturno,taxaFixaMensal,valorFracao);
		return estacio;
	}
}

