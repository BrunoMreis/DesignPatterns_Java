
public interface EstadoOrcamento {
	
	
	public void aplicaDescontoExtra(Orcamento orcamento);
	
	//muda o estado atual
	public void aprova(Orcamento orcamento);
	public void reprova(Orcamento orcamento);
	public void finaliza(Orcamento orcamento);

}
