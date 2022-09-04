package estacionamento;

import java.util.LinkedList;
import java.util.List;

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
	
	public float calcularContratante(){
		
		Evento e = new Evento(inicioEvento, fimEvento ,taxaFixaEve);
		int valor = e.getTaxaFixaEve();
		float total = (valor * es.contratante) / 100;
		return total;
		
		
		
	}
	
}
