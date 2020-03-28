package DesignPatternes1;

public class Aprovado implements EstadoOrcamento {
	private static boolean descontatoUnico;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontatoUnico)
		 orcamento.total -= orcamento.total * 0.02;
		descontatoUnico = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Pedido já está aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento Reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
			orcamento.estadoAtual = new Finalizado();
	}

}
