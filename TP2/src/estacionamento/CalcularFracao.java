package estacionamento;

public class CalcularFracao extends Padrao {
	private float valorTotalFracao;
	
	public CalcularFracao() {
	}
	
	public CalcularFracao(float valorTotalFracao) {
		this.valorTotalFracao = valorTotalFracao;
	}
	
	
	public float getValorTotalFracao() {
		return valorTotalFracao;
	}

	public void setValorTotalFracao(float valorTotalFracao) {
		this.valorTotalFracao = valorTotalFracao;
	}

	
	public float calcularValor(int valorFracao) {
		return (Float) null;
	}
	
	public float calcularContratante(int valorFracao, int contratante) {
		return (Float) null;
	}
	
	@Override
	public String calcularTempo() {
		return null;
	}

}
