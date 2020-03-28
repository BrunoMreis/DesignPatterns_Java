import java.util.List;

public class RelatorioSimples extends TemplateMethodRelatorio {

	@Override
	protected String exibeCabecalho(Conta conta) {
		String cabecalho = "Banco: " + conta.getNomeBanco();
		cabecalho = cabecalho + " telefone: " + conta.getTelefoneBanco();
		return cabecalho;
	}

	@Override
	protected void corpoDoRelatorio(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getNomeTitular());
			System.out.println(conta.getSaldo());
		}
	}

	@Override
	protected String exiberRodape(Conta conta) {
		String rodape = "Banco: " + conta.getNomeBanco();
		rodape = rodape + " telefone: " + conta.getTelefoneBanco();
		return rodape;
	}

}
