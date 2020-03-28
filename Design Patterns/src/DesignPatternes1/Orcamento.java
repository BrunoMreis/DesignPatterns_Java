package DesignPatternes1;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	public double total;
	private List<Item> lista = new ArrayList<Item>();
	public static int quantidadeDeItens;
	
	protected EstadoOrcamento estadoAtual;
	
	
	public Orcamento(double total) {
		this.total = total;	
		
		estadoAtual = new EmAprovacao();
		
	}


	public void aplicaDescontoExtra() {
		
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reporva() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
	

	public void adicionaItem(Item item) {
		lista.add(item);
		this.quantidadeDeItens++;
	}


	public List<Item> getLista() {
		return lista;
	}


	public double getTotal() {
		return total;
	}



	
	
	
	
	
	


}
