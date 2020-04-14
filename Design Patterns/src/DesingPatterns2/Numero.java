package DesingPatterns2;

public class Numero implements Expressao {

	private double numero;

	public Numero(double numero) {
		super();
		this.numero = numero;
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	
	@Override
	public double avalia() {

		
		return this.numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}


	
}
