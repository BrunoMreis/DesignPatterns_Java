package DesignPatternes1;

public class ImpostoBrasileiro extends Imposto {
	
	public ImpostoBrasileiro() {
	}
	
	public ImpostoBrasileiro(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getTotal() * 0.70 + calculaOutroImposto(orcamento);
	}

}
