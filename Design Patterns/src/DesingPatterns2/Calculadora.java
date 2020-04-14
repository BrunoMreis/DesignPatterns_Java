package DesingPatterns2;

public abstract class Calculadora implements Expressao {

	protected Expressao esquerda;
	protected Expressao direita;
	protected Expressao expressaoUnica;

	public Calculadora(Expressao esquerda, Expressao direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public Calculadora(Expressao expressaoUnica) {
		this.expressaoUnica = expressaoUnica;

	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

	public Expressao getExpressaoUnica() {
		return expressaoUnica;
	}

	
	
}
