import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private Calendar dataDeEmissao;
	private String observacoes;

	private List<ItemDaNota> itens;

	public NotaFiscalBuilder comNome(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comImposto(double imposto) {
		this.imposto = imposto;
		return this;
	}

	public NotaFiscalBuilder comDataDeEmissao(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
		return this;
	}
	
	public NotaFiscalBuilder comDataDeEmissao(int dia, int mes, int ano) {
		dataDeEmissao = new GregorianCalendar();
		dataDeEmissao.set(ano, mes, dia);		
		return this;
	}

	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacoes = observacao;
		return this;
	}

	public NotaFiscalBuilder comItensDaNota(ItemDaNota itemDaNota) {
		this.itens.add(itemDaNota);
		this.valorBruto += itemDaNota.getValor();
		this.imposto += (itemDaNota.getValor() * 0.0005);
		return this;
	}

	public NotaFiscal builder() {
		return new NotaFiscal(razaoSocial, cnpj, imposto, dataDeEmissao, observacoes, itens);
	}
}
