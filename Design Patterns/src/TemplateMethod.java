
public abstract class TemplateMethod extends Imposto {
	
	public TemplateMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public TemplateMethod(Imposto outroImposto){
		super(outroImposto);
	}

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
