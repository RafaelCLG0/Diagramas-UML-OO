package estacionamento;

import java.util.Calendar;
/* import java.util.LinkedList;
import java.util.List; */

import javax.swing.JOptionPane;

public class GerenciarAcessos {
	
	public static Estacionamento es;
	
	public static Acessos a;
	
	public GerenciarAcessos() {
		a = new Acessos();
		es = new Estacionamento();
	}
	private static void criarAcesso() {
		String placa = JOptionPane.showInputDialog("Informe a Placa do veículo");		
		String dataDeEntrada = JOptionPane.showInputDialog("Informe a Data de Entrada");
		String dataDeSaida = JOptionPane.showInputDialog("Informe a Data de Saida");
			int opcao = JOptionPane.showConfirmDialog(null, "É do tipo Evento ?");
			if (opcao == JOptionPane.YES_OPTION) {
				String inicioDoEvento = JOptionPane.showInputDialog("Informe a hora do Evento");
				String saidaDoEvento = JOptionPane.showInputDialog("Informe a saida do Evento");
				String taxaDoEvento = JOptionPane.showInputDialog("Informe a taxa do Evento");
				int taxa = Integer.parseInt(taxaDoEvento);
				GerenciarAcessos b = new Evento(inicioDoEvento,saidaDoEvento,taxa);
				 Evento e = (Evento) b ;
				 e.setInicioEvento(inicioDoEvento);
				 e.setFimEvento(saidaDoEvento);
				 e.setTaxaFixaEve(taxa); 
				 }
			
			else if(opcao == JOptionPane.NO_OPTION) {
				int opcao2 = JOptionPane.showConfirmDialog(null,"É do tipo Mensalista ?");
				if(opcao2 == JOptionPane.YES_OPTION) {
					String horaDeEntrada = JOptionPane.showInputDialog("Informe a hora de Entrada");		
					String horaDeSaida = JOptionPane.showInputDialog("Informe a hora de Saida");
					a.setHoraEntrada(horaDeEntrada);
					a.setHoraSaida(horaDeSaida);
					
					
					}
			}
			else {
				String horaDeEntrada = JOptionPane.showInputDialog("Informe a hora de Entrada");		
				String horaDeSaida = JOptionPane.showInputDialog("Informe a hora de Saida");
				
			}
	}
	
	/* public String addAcesso() {
		return a.add(); 
	} */
	
	protected float calcularValor() {
		return (Float) null;
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
