package estacionamento;

import java.util.Date;

public class Acessos {
	
	protected String placa, 
				     horaEntrada, 
				     horaSaida;
	
	protected Date dataEntrada,
		 dataSaida;
	
	protected boolean evento, 
			mensalista;
	
	public Acessos(String placa, Date dataEntrada, Date dataSaida, boolean evento, boolean mensalista, String horaEntrada, String horaSaida) {
		this.placa = placa;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.evento = evento;
		this.mensalista = mensalista;
		//atributos horaEntrada e horaSaida
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}
	
	//getters and setters horaEntrada e horaSaida
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
	//---------
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
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
	
	
}
