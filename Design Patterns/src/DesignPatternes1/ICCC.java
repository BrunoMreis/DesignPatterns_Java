
public class ICCC extends Imposto {

	public ICCC() {
		super(null);

	}

	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {

		if (orcamento.getTotal() <= 1000.00) {
			return orcamento.getTotal() * (5.0 / 100) + calculaOutroImposto(orcamento);
		} 
		if (orcamento.getTotal() > 1000.00 && orcamento.getTotal() <= 3000.00) {
			return orcamento.getTotal() * (7.0 / 100) + calculaOutroImposto(orcamento);
		} 
			return orcamento.getTotal() * (8.0 / 100) + 30.00 + calculaOutroImposto(orcamento);
		

	}

}
