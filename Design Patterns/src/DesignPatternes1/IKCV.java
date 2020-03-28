
public class IKCV extends TemplateMethod {

	public IKCV() {

	}

	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected double maximoTaxamento(Orcamento orcamento) {
		return orcamento.getTotal() * 0.01 + calculaOutroImposto(orcamento);
	}

	@Override
	protected double minimoTaxamento(Orcamento orcamento) {
		return orcamento.getTotal() * 0.006 + calculaOutroImposto(orcamento);
	}

	@Override
	protected boolean deveSerMinimoTaxamento(Orcamento orcamento) {

		boolean maior = false;
		for (Item item : orcamento.getLista()) {
			if (item.getValor() > 100.0) {
				maior = true;
				break;
			}

		}

		if (orcamento.getTotal() > 500.00 && maior) {
			return false;
		}

		return true;
	}

}
