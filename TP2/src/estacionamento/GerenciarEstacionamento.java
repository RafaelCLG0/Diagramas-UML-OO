package estacionamento;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.DescricaoEmBrancoException;
import exceptions.ObjetoNaoEncontradoException;
import exceptions.ValorAcessoInvalidoException;

public class GerenciarEstacionamento {
	
	public static Estacionamento estacio;
	
	public List<Estacionamento> e;
	
	static GerenciarAcessos[] ga = new GerenciarAcessos[0];
	
	public GerenciarEstacionamento() {
		
		e = new LinkedList<Estacionamento>();
	}
	
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

	public boolean addEstacionamento() throws DescricaoEmBrancoException, ValorAcessoInvalidoException, ObjetoNaoEncontradoException {
		String tipo = JOptionPane.showInputDialog("Informe o tipo do Estacionamento");
		estacio.setTipoDeEstacionamento(tipo);
		Estacionamento estacio = findEstacionamento(tipo);
		if(estacio == null) {
			throw new ObjetoNaoEncontradoException(estacio);
		}
		try {
		String capa = JOptionPane.showInputDialog("Informe a Capacidade de Vagas");
		String valo = JOptionPane.showInputDialog("Informe o Valor Da Fra��o");
		String hrcheia = JOptionPane.showInputDialog("Informe o Valor Do Desconto sobre a Hora Cheia");
		String dia = JOptionPane.showInputDialog("Informe o Valor da Diaria Diurna");
		String not = JOptionPane.showInputDialog("Informe a Porcentagem da Diaria Noturna");
		String txcontra = JOptionPane.showInputDialog("Informe a Taxa do Contratante");
		String taxamensal = JOptionPane.showInputDialog("Informe a Taxa Fixa Mensal");
		String hrabrir = JOptionPane.showInputDialog("Informe a Hora de Abrir : (HH:mm)");
		String hrfechar = JOptionPane.showInputDialog("Informe a Hora de Fechar : (HH:mm)");
		
		int capacidade = Integer.parseInt(capa);
		int valor = Integer.parseInt(valo);
		float horacheia = Float.parseFloat(hrcheia);
		int diaria = Integer.parseInt(dia);
		float noturno = Float.parseFloat(not);
		int mensal = Integer.parseInt(taxamensal);
		float contra = Float.parseFloat(txcontra);
		
		estacio.setValorFracao(valor);
		estacio.setCapacidade(capacidade);
		estacio.setTaxaDiaria(diaria);
		estacio.setContratante(contra);
		estacio.setTaxaFixaMensal(mensal);
		estacio.setHoraDeAbrir(hrabrir);
		estacio.setHoraDeFechar(hrfechar);
		estacio.setTaxaDiaria(diaria);
		estacio.setTaxaNoturno(noturno);
		estacio.setDescontoHora(horacheia);
		
		estacio = Estacionamento.criarEstacionamento(tipo, hrabrir, hrfechar, capacidade, horacheia, contra, diaria, noturno, mensal, valor);
		
		}catch (DescricaoEmBrancoException e) {
			
		}catch (ValorAcessoInvalidoException e) {
			
		}
		
		boolean resposta = e.add(estacio); 
		
		return resposta;
	} 

	
	
	private Estacionamento findEstacionamento(String tipoDeEstacionamento) {
		Estacionamento encontrado = null;
		for(Estacionamento estacio : e) {
			if(estacio.getTipoDeEstacionamento().equalsIgnoreCase(tipoDeEstacionamento)) {
				encontrado = estacio;
				break;
			}
		}
		return encontrado;
	}

	public String calcularTotalEstacionamento(float totalContratante) {
		return null;
	}
	public static int converterHora(String hora) {
	String horari = hora.substring (0,2);
	String minut = hora.substring(3,5);
	int horario = Integer.parseInt(horari);
	int minutos = Integer.parseInt(minut);
	return (60 * horario) + minutos;
	}


}
