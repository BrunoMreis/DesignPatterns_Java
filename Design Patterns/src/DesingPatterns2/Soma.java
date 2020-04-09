package DesingPatterns2;

public class Soma extends Calculadora implements Expressao {
	

	public Soma(Expressao esquerda, Expressao direita) {
		super(esquerda, direita);
		
	}

	@Override
	public Double avalia() {
		Double esquerda = this.esquerda.avalia();
		Double direita = this.direita.avalia();
		
		return esquerda - direita;
	}
	

}
