
public class TestaImpostoCoposto {

	public static void main(String[] args) {
		ICCC imposto = new ICCC(new ISS());
		
		Orcamento orcamento = new Orcamento(1000);
		
		System.out.println(imposto.calculaImposto(orcamento));

	}

}
