package estacionamento;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.DescricaoEmBrancoException;
import exceptions.ObjetoNaoEncontradoException;
import exceptions.ValorAcessoInvalidoException;

public class GerenciarAcessos {
	
	public static Acessos a;
	
	public static Estacionamento es;
	
	private List<Acessos> ac;
	
	public GerenciarAcessos() {
		
		ac = new LinkedList<Acessos>();
		
		es = new Estacionamento();
	}
		private static void cadrastrarAcesso() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
			String placa = JOptionPane.showInputDialog("Informe a Placa do veículo:");		
			String dataDeEntrada = JOptionPane.showInputDialog("Informe a Data de Entrada:");
			String dataDeSaida = JOptionPane.showInputDialog("Informe a Data de Saida:");
			
			a.setPlaca(placa);
			a.setDataEntrada(dataDeEntrada);
			a.setDataSaida(dataDeSaida);
			
			int evento = JOptionPane.showConfirmDialog(null, "É do tipo Evento ?:");
			
			if (evento == JOptionPane.YES_OPTION) { //Evento
				a.setEvento(true);
				
				String inicioDoEvento = JOptionPane.showInputDialog("Informe a hora do Evento:");
				String saidaDoEvento = JOptionPane.showInputDialog("Informe a saida do Evento:");
				String taxaDoEvento = JOptionPane.showInputDialog("Informe a taxa do Evento:");
				int taxa = Integer.parseInt(taxaDoEvento);
				
				GerenciarAcessos b = new Evento(inicioDoEvento,saidaDoEvento,taxa);
				Evento e = (Evento) b;
				
				e.setInicioEvento(inicioDoEvento);
				e.setFimEvento(saidaDoEvento);
				e.setTaxaFixaEve(taxa);
				}
			
			else if(evento == JOptionPane.NO_OPTION) { 
				int mensalista = JOptionPane.showConfirmDialog(null,"É do tipo Mensalista ?");
				
				if(mensalista == JOptionPane.YES_OPTION) { //Mensalista
					a.setMensalista(true);
					
					String horaDeEntrada = JOptionPane.showInputDialog("Informe a hora de Entrada:");		
					String horaDeSaida = JOptionPane.showInputDialog("Informe a hora de Saida:");
					a.setHoraEntrada(horaDeEntrada);
					a.setHoraSaida(horaDeSaida);
					}
			}
			else { //Padrão
				String horaDeEntrada = JOptionPane.showInputDialog("Informe a hora de Entrada:");		
				String horaDeSaida = JOptionPane.showInputDialog("Informe a hora de Saida:");
				
				a.setHoraEntrada(horaDeEntrada);
				a.setHoraSaida(horaDeSaida);
			}
	}
	
	/*
	public String addAcesso() {
		return ac.add(); 
	} 
	*/
	
	protected float calcularValor() {
		return 0.0f;
	}
	
	protected float calcularContratante() {
		return (Float) null;
	}
	
	protected float pesquisarAcesso() {
		return (Float) null;
	}
	
	protected float atualizarAcesso() {
		return (Float) null;
	}
	
	protected float removerAcesso() {
		return (Float) null;
	}

}
