package estacionamento;

public class CalcularTempo extends Padrao {
	private float valorTotal;
	
	public int CalcularTempo() {
	String ent = a.getHoraEntrada();
	int entra = Integer.parseInt(ent);
	String sai = a.getHoraSaida();
	int said = Integer.parseInt(sai);
	int temp = entra - said;
	return temp;
	}
	
	public CalcularTempo(float valorTotal) {
		
		
		this.valorTotal = valorTotal;
	}
	
	
	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	
	public float calcularValor(int valor) {
		return (Float) null;
	}
	
	public float calcularContratante(int valor, int contratante) {
		return (Float) null;
	}

	public String calcularTempo() {
		return null;
	}

}
