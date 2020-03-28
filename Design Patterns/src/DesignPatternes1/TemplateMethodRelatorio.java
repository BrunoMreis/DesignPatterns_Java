package DesignPatternes1;
import java.util.List;

public abstract class TemplateMethodRelatorio {
	
	protected abstract String exibeCabecalho(Conta conta);
	protected abstract void corpoDoRelatorio(List<Conta> contas);
	protected abstract String exiberRodape(Conta conta);

}
