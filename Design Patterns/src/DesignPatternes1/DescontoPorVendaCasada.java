package DesignPatternes1;
import java.util.ArrayList;
import java.util.List;

public class DescontoPorVendaCasada implements Desconto {
	
	Desconto proximoDesconto;
	List<Item> itens = new ArrayList<>();

	@Override
	public double desconto(Orcamento orcamento) {
		this.itens = orcamento.getLista();
		if(contemItemDeNome("Caneta") & contemItemDeNome("Lapis")) {
			return orcamento.getTotal()* 0.05;
		}
		return proximoDesconto.desconto(orcamento);	
	}
	
	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
		
		
	}
	
	
    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) {
            	return true;
            }
        }
        return false;
    }

}
