public class EmAprovacao implements EstadoOrcamento {
	
	private static boolean descontatoUnico;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontatoUnico)
		orcamento.total -= orcamento.total * 0.05;
		descontatoUnico = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovação não pode ser finalizado");
		
	}

}
