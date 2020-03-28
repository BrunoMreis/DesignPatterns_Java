package DesignPatternes1;

public class ICMS extends Imposto {
	public ICMS() {
		// TODO Auto-generated constructor stub
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getTotal()*(5.0/100)+50.00 + calculaOutroImposto(orcamento);
	}

}
