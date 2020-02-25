
public class ICMS implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getTotal()*(5/100)+50.00;
	}

}
