package DesignPatternes1;

import java.util.Random;

public class Arrojado implements Investidor {

	@Override
	public double rentabilidade(double investimento) {
		double ganho = new Random().nextDouble()*100.00;
		if(ganho < 20) {
			return investimento * 5/100.00;
		}
		else if(ganho > 20 & ganho < 50 )
		{
			return investimento * 3/100.00;
		}
		else		
		return investimento * 0.6/100.00;
	}

}
