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
	
	public float calcularValor(int valor, float desconto) throws ValorAcessoInvalidoException {
		int	temp = calcularTempo();
		//int valor = estacio.getValorFracao();
		//float desconto = estacio.getDescontoHora();
		
		float resultado = ((int) temp/15) * valor;
		
		if(temp >= 60) {
			return (resultado - ( resultado * ((int) temp/60)*desconto));
		}
		
		return resultado;
	}
	
	public float calcularContratante(int valor, float desconto) throws ValorAcessoInvalidoException {
		float contratante = calcularValor(valor, desconto) * estacio.contratante;
		return contratante;
	}

	public int calcularTempo() throws ValorAcessoInvalidoException {
		String dataDeEntrada = a.getDataEntrada();
		String dataDeSaida = a.getDataSaida();
		int	horaDeEntrada = converterHora(a.getHoraEntrada());
		int horaDeSaida = converterHora(a.getHoraSaida());
		int temp;
		
		if (dataDeEntrada != dataDeSaida) {
			temp = ((24*60) - horaDeEntrada) + horaDeSaida; //24*60 = Meia-noite
		}else {
			temp = horaDeSaida - horaDeEntrada;
		}
		
		return temp;
	}

}
