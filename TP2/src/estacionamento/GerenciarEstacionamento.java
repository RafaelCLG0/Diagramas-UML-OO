package estacionamento;

import java.util.LinkedList;
import java.util.List;

public class GerenciarEstacionamento {
	private List<Estacionamento> e;
	
	static GerenciarAcessos[] ga = new GerenciarAcessos[0];
	
	float totalContratante;
	
	public GerenciarEstacionamento (float totalContratante) {
		this.totalContratante = totalContratante;
	}

	public float getTotalContratante() {
		return totalContratante;
	}

	public void setTotalContratante(float totalContratante) {
		this.totalContratante = totalContratante;
	}

	public String criarEstacionamento() {
		return null;
	}
	public String calcularTotalEstacionamento(float totalContratante) {
		return null;
	}

}
