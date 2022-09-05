package estacionamento;

public class Turnos extends Padrao {
	
	private boolean noturno;
	
	
	public Turnos(boolean noturno) {
		this.noturno = noturno;
	}
	
		
	public boolean isNoturno() {
		return noturno;
	}

	public void setNoturno(boolean noturno) {
		this.noturno = noturno;
	}
	
	public int calcularDiaria() {
		return (Integer) null;
	}
	
	public boolean calcularDiariaNoturno() {
		return (Boolean) null;
	}
	
	public float calcularValor(int taxaNoturno) {
		return (Float) null;
	}
	
	public float calcularContratante_D(int taxaDiaria, int contratante) {
		return (Float) null;
	}
	
	public float calcularContratante_N(int taxaNoturna, int contratante) {
		return (Float) null;
	}
	
	public int calcularTempo() {
		return 0;
	}

}
