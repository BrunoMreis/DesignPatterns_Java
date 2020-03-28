package DesignPatternes1;

//observador concreto 
public class MultiplicadorDeNotaFiscal implements ExecutaAcoesNotaFiscal{

	private double fator;
	
	public MultiplicadorDeNotaFiscal(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println(nf.getValorBruto() * fator);
		
	}


}
