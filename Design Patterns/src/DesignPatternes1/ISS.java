package DesignPatternes1;

public class ISS extends Imposto {
	
	public ISS(){
		
	}
	public ISS(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getTotal()*(6.0/100)+ calculaOutroImposto(orcamento);
	}
		
	

}
