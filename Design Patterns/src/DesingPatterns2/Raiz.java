package DesingPatterns2;

public class Raiz extends Calculadora implements Expressao {

	public Raiz(Expressao expressao) {
		super(expressao);
	}

	@Override
	public double avalia() {
		
		return Math.sqrt(expressaoUnica.avalia());
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaiz(this);
		
	}


}
