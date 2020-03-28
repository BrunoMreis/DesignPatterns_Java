
public class TestaNotaObserver {

	public static void main(String[] args) {

		ItensDaNotaBuilder iDNB = new ItensDaNotaBuilder();

		iDNB.comDescricao("SSD");
		iDNB.comValor(289.50);

		ItemDaNota itdn1 = iDNB.constroi();
		ItemDaNota itdn2 = new ItemDaNota("Processador", 689.50);
		ItemDaNota itdn3 = new ItemDaNota("Placa Mãe", 450.90);
		ItemDaNota itdn4 = new ItemDaNota("Memoria DDR4 8GB", 209.0);

		NotaFiscalBuilder nfb = new NotaFiscalBuilder();

		nfb.comNome("Loja N22")
		.comCNPJ("1235")
		.comDataDeEmissao(10, 03, 2020)
		.comObservacao("Montagem de um PC")
		.comItensDaNota(itdn1)
		.comItensDaNota(itdn2)
		.comItensDaNota(itdn3)
		.comItensDaNota(itdn4)
		.executaAcoesNotaFiscal(new EnviadorDeEmail())
		.executaAcoesNotaFiscal(new NotaFiscalDAO())
		.executaAcoesNotaFiscal(new MultiplicadorDeNotaFiscal(30))
		.builder();
	}

}
