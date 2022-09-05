package estacionamento;

import exceptions.DescricaoEmBrancoException;
import exceptions.ValorAcessoInvalidoException;

public class Estacionamento {

	private String tipoDeEstacionamento;

	private int capacidade;

	protected int horaDeAbrir, horaDeFechar;

	protected float descontoHora, contratante, taxaNoturno;

	protected int taxaDiaria, taxaFixaMensal, valorFracao;

	public Estacionamento(String tipoDeEstacionamento, int horaDeAbrir, int horaDeFechar, int capacidade, float descontoHora, float contratante, int taxaDiaria, float taxaNoturno,
			int taxaFixaMensal, int valorFracao) {

		this.capacidade = capacidade;
		this.horaDeAbrir = horaDeAbrir;
		this.horaDeFechar = horaDeFechar;
		this.tipoDeEstacionamento = tipoDeEstacionamento;
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

	public int getHoraDeAbrir() {
		return horaDeAbrir;
	}

	public void setHoraDeAbrir(int horaDeAbrir) {
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

	public float getTaxaNoturno() {
		return taxaNoturno;
	}

	public void setTaxaNoturno(float taxaNoturno) {
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

	public void setHoraDeFechar(int horaDeFechar) {
		this.horaDeFechar = horaDeFechar;
	}

	public int getCapacidade() {
		return capacidade;
	}
	public int getHoraDeFechar() {
		return horaDeFechar;
	}

	public String getTipoDeEstacionamento() {
		return tipoDeEstacionamento;
	}

	public static Estacionamento criarEstacionamento (String tipoDeEstacionamento, int horaDeAbrir, int horaDeFechar, int capacidade, float descontoHora, float contratante ,int taxaDiaria, float taxaNoturno, int taxaFixaMensal, int valorFracao)
			throws DescricaoEmBrancoException , ValorAcessoInvalidoException{
		if(tipoDeEstacionamento.equalsIgnoreCase(""))
		{	throw new DescricaoEmBrancoException();
		}
		else if(horaDeAbrir <= 0 || horaDeFechar <= 0 ||capacidade <= 0 || descontoHora <= 0 || contratante <= 0 || taxaDiaria <= 0 || taxaNoturno <= 0 || taxaFixaMensal <= 0 || valorFracao <= 0) {	
		}

		Estacionamento estacio = new Estacionamento(tipoDeEstacionamento,horaDeAbrir,horaDeFechar,capacidade,descontoHora,contratante ,taxaDiaria,taxaNoturno,taxaFixaMensal,valorFracao);
		return estacio;
	}
}
