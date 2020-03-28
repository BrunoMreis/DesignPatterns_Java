
public class Desconto5intens implements Desconto{
	
	Desconto proximoDesconto;
	

	@Override
	public double desconto(Orcamento orcamento) {
		if(orcamento.getLista().size() >5) {
			return orcamento.getTotal()*0.1;
		}
		return proximoDesconto.desconto(orcamento);
	}


	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
