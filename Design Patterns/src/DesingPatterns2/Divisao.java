package DesingPatterns2;

public class Divisao extends Calculadora implements Expressao {
	
	public Divisao(Expressao esquerda, Expressao direita) {
		super(esquerda, direita);
	}

	@Override
	public double avalia() {
		Double esquerda = this.esquerda.avalia();
		Double direita = this.direita.avalia();
		
		return esquerda / direita;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaDivisao(this);
		
	}
	
}
