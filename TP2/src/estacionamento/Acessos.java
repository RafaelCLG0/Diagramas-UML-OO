package estacionamento;

import java.util.Date;

import exceptions.DescricaoEmBrancoException;

public class Acessos {
	
	protected String placa;
	
		protected int horaEntrada,
		horaSaida;
		
	protected String dataEntrada,
		 dataSaida;
	
	protected boolean evento, 
			mensalista;
	
	
	public Acessos(String placa, String dataEntrada, String dataSaida, boolean evento, boolean mensalista, int horaEntrada, int horaSaida) {
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

		
	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
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
	
	public static Acessos criarAcesso(String placa, String dataEntrada, String dataSaida, boolean evento, boolean mensalista, int horaEntrada, int horaSaida)
		throws DescricaoEmBrancoException {
		if (placa.equalsIgnoreCase("")|| dataEntrada.equalsIgnoreCase("")|| dataSaida.equalsIgnoreCase(""))
		{ throw new DescricaoEmBrancoException(); 
		}
		else if(horaEntrada <= 0 || horaSaida <= 0);{
		}
		Acessos a = new Acessos(placa,dataEntrada,dataSaida,evento,mensalista,horaEntrada,horaSaida);
		return a;
	}
}
