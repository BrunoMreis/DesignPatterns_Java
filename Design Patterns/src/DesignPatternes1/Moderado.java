package DesignPatternes1;

public class Moderado implements Investidor {

	@Override
	public double rentabilidade(double investimento) {

		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		if (escolhido) {
			return investimento * (2.5 / 100.00);
		} else {
			return investimento * (0.7 / 100.00);
		}
	}

}
