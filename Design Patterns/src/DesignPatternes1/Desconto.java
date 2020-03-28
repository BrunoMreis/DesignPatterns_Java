package DesignPatternes1;

public interface Desconto {
	
	double desconto(Orcamento orcamento);
	void setProximo(Desconto proximoDesconto);

}
