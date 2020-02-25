import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	private double total;
	private List<Item> lista = new ArrayList<Item>();
	
	
	public Orcamento(double total) {
		super();
		this.total = total;	
	}


	public void adicionaItem(Item item) {
		lista.add(item);
	}


	public List<Item> getLista() {
		return lista;
	}


	public double getTotal() {
		return total;
	}



	
	
	
	
	
	


}
