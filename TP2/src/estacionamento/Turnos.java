package estacionamento;

import exceptions.ValorAcessoInvalidoException;

public class Turnos extends Padrao {
	
	private boolean noturno;
	
	
	public Turnos(boolean noturno) {
		this.noturno = noturno;
	}
	
		
	public boolean isNoturno() throws ValorAcessoInvalidoException {
		int confirma = calcularTempo();
		
		if (dataDeEntrada != dataDeSaida && confirma < 540) {
			noturno = true;
		}else if (dataDeEntrada != dataDeSaida && confirma >= 540) {
			noturno = false;
		}
		return noturno;
	}

	public void setNoturno(boolean noturno) {
		this.noturno = noturno;
	}
	
	public float calcularValor(int taxaDiaria, int taxaNoturno) throws ValorAcessoInvalidoException {
		boolean turn = isNoturno();
		if (turn == false) {                     //Maior que 9h de estadia
			float resultado = (float)taxaDiaria;
		}else {
			float resultado = (taxaDiaria/100)*taxaNoturno
		}
		return resultado;
	}
	
	public float calcularContratante_Turnos(int taxaDiaria, int taxaNoturno, int contratante) {
		float contratante = calcularValor(taxaDiaria, taxaNoturno) * estacio.contratante;
		return contratante;
	}
	
	public int calcularTempo() throws ValorAcessoInvalidoException {
		String dataDeEntrada = a.getDataEntrada();
		String dataDeSaida = a.getDataSaida();
		int horaDeEntrada = converterHora(a.getHoraEntrada());
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
