package estacionamento;

import exceptions.ValorAcessoInvalidoException;

public class Turnos extends Padrao {

	private boolean noturno;

	public Turnos(boolean noturno) {
		this.noturno = noturno;
	}

	public boolean isNoturno() throws ValorAcessoInvalidoException {
		int confirma = calcularTempo();

		String dataDeEntrada = a.getDataEntrada();
		String dataDeSaida = a.getDataSaida();

		if (dataDeEntrada != dataDeSaida && (confirma < 540 || confirma > 180) { //Eu define que entre 3 e 9 h mudando de dia é acesso noturno
			noturno = true;
		} else if (confirma >= 540) { //Para uma acesso diario o avesso deve ser maior que 9 h e pode, ou não, mudar de dia
			noturno = false;
		}
		return noturno;
	}

	public void setNoturno(boolean noturno) {
		this.noturno = noturno;
	}

	public float calcularValor(int taxaDiaria, int taxaNoturno) throws ValorAcessoInvalidoException {
		float resultado;

		boolean turn = isNoturno();

		if (turn == false) { // Maior que 9h de estadia
			resultado = (float) taxaDiaria;
		} else {
			resultado = (taxaDiaria / 100) * taxaNoturno;
		}
		return resultado;
	}

	public float calcularContratante_Turnos(int taxaDiaria, int taxaNoturno, int contratante)
			throws ValorAcessoInvalidoException {
		float contra = calcularValor(taxaDiaria, taxaNoturno) * estacio.contratante;
		return contra;
	}

	public int calcularTempo() throws ValorAcessoInvalidoException {
		String dataDeEntrada = a.getDataEntrada();
		String dataDeSaida = a.getDataSaida();
		int horaDeEntrada = converterHora(a.getHoraEntrada());
		int horaDeSaida = converterHora(a.getHoraSaida());
		int temp;

		if (dataDeEntrada != dataDeSaida) {
			temp = ((24 * 60) - horaDeEntrada) + horaDeSaida; // 24*60 = Meia-noite
		} else {
			temp = horaDeSaida - horaDeEntrada;
		}

		return temp;
	}

}
