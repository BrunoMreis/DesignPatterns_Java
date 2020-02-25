
public class ICMS implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		return valor*(5/100)+50.00;
	}

}
