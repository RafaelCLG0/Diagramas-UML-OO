package estacionamento;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.DescricaoEmBrancoException;
import exceptions.ObjetoNaoEncontradoException;
import exceptions.ValorAcessoInvalidoException;

public class GerenciarAcessos {
	
	public static Acessos a;
	
	public static Estacionamento estacio;
	
	public static Estacionamento es;
	
	private static List<Acessos> acs;
	
	
	public GerenciarAcessos() {
		
		acs = new LinkedList<Acessos>();
		
		es = new Estacionamento();
	}		
		public static boolean cadrastrarAcesso() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
			boolean roda = false;
			do {
				roda = false;
				
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
				try {
				e.criarEvento(inicioDoEvento, saidaDoEvento, taxa);
				}catch(DescricaoEmBrancoException y) {	
				}catch(ValorAcessoInvalidoException y) {
				}
				}
			
			else if(evento == JOptionPane.NO_OPTION) { 
				int mensalista = JOptionPane.showConfirmDialog(null,"É do tipo Mensalista ?");
				
				if(mensalista == JOptionPane.YES_OPTION) { //Mensalista
					a.setMensalista(true);
					String horaDeEnt = JOptionPane.showInputDialog("Informe a hora de Entrada:");	
					String horaDeSai = JOptionPane.showInputDialog("Informe a hora de Saida:");
					int horaDeEntrada = Integer.parseInt(horaDeEnt);
					int horaDeSaida = Integer.parseInt(horaDeSai);
					a.setHoraEntrada(horaDeEntrada);
					a.setHoraSaida(horaDeSaida);
					
					try {
					a = Acessos.criarAcesso(placa, dataDeEntrada, dataDeSaida, false, true, horaDeEntrada, horaDeSaida);
					}catch(DescricaoEmBrancoException b) {	
					}
					}
					
				}
			
			else { //Padrão
				String horaDeEnt = JOptionPane.showInputDialog("Informe a hora de Entrada:");		
				String horaDeSai = JOptionPane.showInputDialog("Informe a hora de Saida:");
				int horaDeEntrada = Integer.parseInt(horaDeEnt);
				int horaDeSaida = Integer.parseInt(horaDeSai);
				a.setHoraEntrada(horaDeEntrada);
				a.setHoraSaida(horaDeSaida);
	
				if(horaDeEntrada <= estacio.getHoraDeAbrir() || estacio.getHoraDeFechar() <= horaDeEntrada) {
					String invalido = JOptionPane.showInputDialog("Horário Inválido");
					atualizarAcesso();
					roda = true;
				}
					
				try {
				a = Acessos.criarAcesso(placa, dataDeEntrada, dataDeSaida, false, false, horaDeEntrada, horaDeSaida);
				}catch(DescricaoEmBrancoException b) {	
				}
			} 
			boolean respost = acs.add(a);
			return respost;
		}while (roda == true);		
	}
	
	protected float calcularValor() {
		return 0.0f;
	}
	
	protected float calcularContratante() {
		return 0.0f;
	}
	
		public Acessos findAcessos(String placa) throws ObjetoNaoEncontradoException {
			Acessos achado = null;
			for(Acessos a : acs) {
				if(a.getPlaca().equalsIgnoreCase(placa)) {
					achado = a;
					break;
			}else { throw new ObjetoNaoEncontradoException(null);
			}
		}	
		return a;
	}
	protected static boolean atualizarAcesso()throws DescricaoEmBrancoException{
		boolean roda = false;
		int info = JOptionPane.showConfirmDialog(null, "Gostaria de Atualizar suas Informações ?");
		if(info == JOptionPane.YES_OPTION) {
 
		}else { throw new DescricaoEmBrancoException();
			}
		return roda;
	}
	
	public boolean removerAcesso(Acessos a) throws DescricaoEmBrancoException{
		boolean resposta = false;
		if(acs.contains(a)) {
			resposta = acs.remove(a);
		}else {throw new DescricaoEmBrancoException();
			}
		return resposta;
	}

}
