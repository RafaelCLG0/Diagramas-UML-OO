package estacionamento;

public class Horas extends CalcularFracao {
	private float valorTotal;
	
	public Horas(float valorTotal) {//, float valorTotalFracao
		this.valorTotal = valorTotal;
		//super(valorTotalFracao);
	}
	
	
	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	
	public float calcularValor(int descontoHora, int valorFracao) {
		return (Float) null;
	}
	
	public float calcularContratante(int descontoHora, int valorFracao, int contratante) {
		return (Float) null;
	}
	
	
	@Override
	public String calcularTempo() {
		return null;
	}
}
