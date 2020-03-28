package DesignPatternes1;

public class DescontoAcimaDeQuinhentos implements Desconto {
	
	Desconto proximoDesconto;
	
	@Override
	public double desconto(Orcamento orcamento) {
		if(orcamento.getTotal()>500.00) {
					
			return proximoDesconto.desconto( orcamento);
		}
			
		return proximoDesconto.desconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
		
	}

}
