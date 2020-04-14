package DesingPatterns2;

public class TesteVisitor {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10.0), new Numero(5.0));
		Expressao direita = new Soma(new Numero(2.0), new Numero(10.0));

		Expressao conta = new Soma(esquerda, direita);
		conta = new Raiz(conta);
		System.out.println(conta.avalia());
		
		Visitor impressora = new Impressora();
		Visitor impressoraprefixa = new ImpressoraPreFixa();
		
		conta.avalia();
		conta.aceita(impressora);
		
		conta.aceita(impressoraprefixa);
	}

}
