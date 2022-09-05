package estacionamento;

public class Mensalista extends GerenciarAcessos {

	public float calcularContratante() {
		float total2 = (es.getTaxaFixaMensal() * es.getContratante()) / 100;
		return total2;

	}
}
