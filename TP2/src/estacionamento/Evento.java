package estacionamento;

public class Evento extends GerenciarAcessos {
	
	private String inicioEvento, 
				   fimEvento;
	
	protected int taxaFixaEve;
	
	
	
	public Evento(String inicioEvento, String fimEvento, int taxaFixaEve) {
		
	}

	
	public String getInicioEvento() {
		return inicioEvento;
	}

	public void setInicioEvento(String inicioEvento) {
		this.inicioEvento = inicioEvento;
	}

	public String getFimEvento() {
		return fimEvento;
	}

	public void setFimEvento(String fimEvento) {
		this.fimEvento = fimEvento;
	}

	public int getTaxaFixaEve() {
		return taxaFixaEve;
	}

	public void setTaxaFixaEve(int taxaFixaEve) {
		this.taxaFixaEve = taxaFixaEve;
	}
	
	
	public float CalcularValor(int taxaFixaEve) {
		return (Float) null;
	}
	
	public float calcularContratante(int taxaFixaEve, int contratante) {
		return (Float) null;
	}
	
}
