package DesignPatternes1;

public abstract class Imposto {
	
	final private Imposto outroImposto;
	
	public Imposto() {
		outroImposto = null; 
	}
	
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	

	public abstract double  calculaImposto(Orcamento orcamento); 
	
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		
		if(outroImposto == null) {
			return 0;
		}
		return this.outroImposto.calculaImposto(orcamento);
		
	}

}
