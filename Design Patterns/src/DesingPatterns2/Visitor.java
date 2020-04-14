package DesingPatterns2;

public interface Visitor {
	
	void visitaSoma(Soma soma);
	void visitaSubtracao(Subtracao subtracao);
	void visitaMutiplicacao(Multiplicacao multiplicacao);
	void visitaDivisao(Divisao divisao);
	void visitaNumero(Numero numer);
	void visitaRaiz(Raiz raiz);

}
