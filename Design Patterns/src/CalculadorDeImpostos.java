
public class CalculadorDeImpostos {
	
	private Imposto imposto;
	private Orcamento orcamento;
	
	
	public CalculadorDeImpostos(Orcamento ocamento, Imposto imposto) {
		this.imposto = imposto;
		this.orcamento = ocamento;
	}

	
	public void calculaImposto() {
		System.out.println(imposto.calculaImposto(orcamento.getValor()));
		
	}
}
