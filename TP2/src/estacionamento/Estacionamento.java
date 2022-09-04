package estacionamento;

public class Estacionamento {
	
	private boolean aberto24h;
	
	private String tipoDeEstacionamento;
	
	private int capacidade;
	
	protected String horaDeAbir,
		   horaDeFechar;
	
	protected float descontoHora,
		  contratante;
	
	protected int taxaDiaria,
		taxaNoturno,
		taxaFixaMensal,
		valorFracao;
	
	
	public Estacionamento(String tipoDeEstacionamento, String horaDeAbrir, String horaDeFechar, int capacidade, boolean aberto24h, 
						  float descontoHora, float contratante ,int taxaDiaria, int taxaNoturno, int taxaFixaMensal, int valorFracao) {
		
		this.capacidade = capacidade;
		this.horaDeAbir = horaDeAbrir;
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

	public String getHoraDeAbir() {
		return horaDeAbir;
	}

	public void setHoraDeAbir(String horaDeAbir) {
		this.horaDeAbir = horaDeAbir;
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

	public String getHoraDeAbrir() {
		return horaDeAbir;
	}
	
	public String getHoraDeFechar() {
		return horaDeFechar;
	}
	
	public String getTipoDeEstacionamento() {
		return tipoDeEstacionamento;
	}
	
}