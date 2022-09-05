package estacionamento;

import exceptions.ValorAcessoInvalidoException;

public class HorasFracao extends Padrao {
	private float valorTotal;
	
	public HorasFracao(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	
	public float calcularValor(int valor) throws ValorAcessoInvalidoException {
		estacio.getValorFracao();
		int	temp = calcularTempo();
		if(temp < 60) {
			if(45 < temp)
			valor = estacio.getValorFracao() * 3;
			
		}
		return (Float) null;
	}
	
	public float calcularContratante(int valor, int contratante) {
		return (Float) null;
	}

	public int calcularTempo() throws ValorAcessoInvalidoException {
		int	horaDeEntrada = converterHora(a.getHoraEntrada());
		int horaDeSaida = converterHora(a.getHoraSaida());
		int entra = horaDeEntrada;
		int saida = horaDeSaida;
		int temp = saida - entra;
		return temp;
	}

}
