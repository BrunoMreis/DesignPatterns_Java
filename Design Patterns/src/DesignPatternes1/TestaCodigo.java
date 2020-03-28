package DesignPatternes1;

public class TestaCodigo {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(100.00);
		
		orcamento.adicionaItem(new Item("Residente Evil 2", 50.00));
		orcamento.adicionaItem(new Item("Caneta", 50.00));
		orcamento.adicionaItem(new Item("Lapis", 50.00));
		
		Desconto d1 = new Desconto5intens();
		Desconto d2 = new DescontoPorVendaCasada();
		Desconto d3 = new DescontoAcimaDeQuinhentos();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		System.out.println(d1.desconto(orcamento));
	}

}
