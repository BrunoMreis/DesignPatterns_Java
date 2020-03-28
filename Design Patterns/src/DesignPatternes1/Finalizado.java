package DesignPatternes1;

public class Finalizado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Pedido finalizado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Pedido finalizado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Pedido finalizado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Pedido finalizado");
		
	}
	 
}
