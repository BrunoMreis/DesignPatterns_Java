
public class EnviadorDeEmail implements ExecutaAcoesNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota Salva no banco");
	}

}
