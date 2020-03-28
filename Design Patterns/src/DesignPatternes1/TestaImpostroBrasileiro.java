package DesignPatternes1;

public class TestaImpostroBrasileiro {

	public static void main(String[] args) {
		Imposto imposto = new ImpostoBrasileiro(new ISS(new IHIT()));
		
		
		Orcamento orcamento = new Orcamento(15000.0);
		
		
		System.out.println(imposto.calculaImposto(orcamento));
	}

}
