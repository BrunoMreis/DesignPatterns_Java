package DesignPatternes1;

public class Conservador implements Investidor{

	@Override
	public double rentabilidade(double investimento) {
		
		return investimento *(0.8/100);
	}

}
