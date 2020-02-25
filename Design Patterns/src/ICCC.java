
public class ICCC implements Imposto {

	@Override
	public double calculaImposto(double valor) {

		if (valor < 1000.00) {
			return valor * (5 / 100);
		} else if (valor > 1000.00 & valor < 3000.00) {
			return valor * (7 / 100);
		} else {
			return valor * (8 / 100) + 30.00;
		}

	}

}
