package DesignPatternes1;

public class ICPP extends TemplateMethod {

	@Override
	protected double maximoTaxamento(Orcamento orcamento) {
		return orcamento.getTotal() * 0.007;
	}

	@Override
	protected double minimoTaxamento(Orcamento orcamento) {
		return orcamento.getTotal() * 0.005;
	}

	@Override
	protected boolean deveSerMinimoTaxamento(Orcamento orcamento) {

		if (orcamento.getTotal() < 500.00) {
			return true;
		}

		return false;
	}

}
