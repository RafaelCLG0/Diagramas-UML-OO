package estacionamento;

public class GerenciarEstacionamento {
	
	// Vou passar atributos dessa classe
	
	String tipoDeEstacionamento,
		   horaDeAbir,
		   horaDeFechar;
	int capacidade;
	
	public GerenciarEstacionamento(String tipoDeEstacionamento, String horaDeAbrir, String horaDeFechar, int capacidade) {
		this.capacidade = capacidade;
		this.horaDeAbir = horaDeAbrir;
		this.horaDeFechar = horaDeFechar;
		this.tipoDeEstacionamento = tipoDeEstacionamento;
		
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