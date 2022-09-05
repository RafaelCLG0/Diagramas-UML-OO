package estacionamento;

import java.util.Date;

import exceptions.DescricaoEmBrancoException;

public class Acessos {
	
	protected String placa;
		
	protected String dataEntrada,
		 dataSaida,horaEntrada,
			horaSaida;
	
	protected boolean evento, 
			mensalista;
	
	
	public Acessos(String placa, String dataEntrada, String dataSaida, boolean evento, boolean mensalista, String horaEntrada, String horaSaida) {
		this.placa = placa;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.evento = evento;
		this.mensalista = mensalista;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}
	

	/*
	 * public Acessos() {
	 */

		
	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public boolean isEvento() {
		return evento;
	}

	public void setEvento(boolean evento) {
		this.evento = evento;
	}

	public boolean isMensalista() {
		return mensalista;
	}

	public void setMensalista(boolean mensalista) {
		this.mensalista = mensalista;
	}
	
	public static Acessos criarAcesso(String placa, String dataEntrada, String dataSaida, boolean evento, boolean mensalista, String horaEntrada, String horaSaida)
		throws DescricaoEmBrancoException {
		if (placa.equalsIgnoreCase("")|| dataEntrada.equalsIgnoreCase("")|| dataSaida.equalsIgnoreCase("")|| horaEntrada.equalsIgnoreCase("")|| horaSaida.equalsIgnoreCase(""))
		{ throw new DescricaoEmBrancoException(); 
		}
		Acessos a = new Acessos(placa,dataEntrada,dataSaida,evento,mensalista,horaEntrada,horaSaida);
		return a;
	}
}
