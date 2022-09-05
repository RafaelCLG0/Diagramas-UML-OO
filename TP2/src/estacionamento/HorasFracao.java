package estacionamento;

public class HorasFracao extends Padrao {
	private float valorTotal;
	
	public String CalcularTempo() {
		return null;
	}
	
	public HorasFracao(float valorTotal) {
		estacio.getValorFracao();
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

	public int calcularTempo() {
		int entra = a.getHoraEntrada();
		int saida = a.getHoraSaida();
		int temp = entra - saida;
		return temp;
	}

}
