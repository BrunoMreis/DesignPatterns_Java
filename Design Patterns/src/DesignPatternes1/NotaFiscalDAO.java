package DesignPatternes1;
//observador concreto 
public class NotaFiscalDAO implements ExecutaAcoesNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("E-mail");
	}

}
