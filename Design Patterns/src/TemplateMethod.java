
public abstract class TemplateMethod implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		if (deveSerMinimoTaxamento(orcamento)) {
			return minimoTaxamento(orcamento);
		} else {
			return maximoTaxamento(orcamento);
		}
	}

	protected abstract double maximoTaxamento(Orcamento orcamento);

	protected abstract double minimoTaxamento(Orcamento orcamento);

	protected abstract boolean deveSerMinimoTaxamento(Orcamento orcamento);

}
