package estacionamento;

public class Mensalista extends GerenciarAcessos {

	public float calcularContratante() {
		float total2 = (es.taxaFixaMensal * es.contratante) / 100;
		return total2;

	}
}
