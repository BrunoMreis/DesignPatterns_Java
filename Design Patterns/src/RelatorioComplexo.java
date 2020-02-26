import java.util.Date;
import java.util.List;

public class RelatorioComplexo extends TemplateMethodRelatorio {

	@Override
	protected String exibeCabecalho(Conta conta) {
		String cabecalho = "Banco: " + conta.getNomeBanco();
		cabecalho = cabecalho + " Endereço: " + conta.getEnderecoBanco();
		cabecalho = cabecalho + " telefone: " + conta.getTelefoneBanco();
		
		return cabecalho;
	}

	@Override
	protected void corpoDoRelatorio(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getNomeTitular());
			System.out.println(conta.getSaldo());
			System.out.println(conta.getAgencia());
			System.out.println(conta.getNumeroConta());
		}
		
	}

	@Override
	protected String exiberRodape(Conta conta) {
		String rodape;
		rodape ="E-mail: " + conta.getEmailBanco() + "Data: " + new Date(System.currentTimeMillis());
		return rodape;
	}

}
