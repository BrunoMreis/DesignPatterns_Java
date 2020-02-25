
public class ICCC implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {

		if (orcamento.getTotal() < 1000.00) {
			return orcamento.getTotal() * (5 / 100);
		} else if (orcamento.getTotal() > 1000.00 & orcamento.getTotal() < 3000.00) {
			return orcamento.getTotal() * (7 / 100);
		} else {
			return orcamento.getTotal() * (8 / 100) + 30.00;
		}

	}

}
