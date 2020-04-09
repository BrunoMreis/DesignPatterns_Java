package DesingPatterns2;

public class Numero implements Expressao {

	private Double numero;

	public Numero(Double numero) {
		super();
		this.numero = numero;
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	
	@Override
	public Double avalia() {

		
		return this.numero;
	}
	
}
