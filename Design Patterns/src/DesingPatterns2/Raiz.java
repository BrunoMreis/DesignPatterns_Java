package DesingPatterns2;

public class Raiz extends Calculadora implements Expressao {

	public Raiz(Expressao expressao) {
		super(expressao);
	}

	@Override
	public Double avalia() {
		
		return Math.sqrt(expressaoUnica.avalia());
	}

}
