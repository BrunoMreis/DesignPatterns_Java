import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private Calendar dataDeEmissao;
	private String observacoes;

	private List<ItemDaNota> itens = new ArrayList<>();

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}



	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double imposto, Calendar dataDeEmissao,
			String observacoes, List<ItemDaNota> itens) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.imposto = imposto;
		this.dataDeEmissao = dataDeEmissao;
		this.observacoes = observacoes;
		this.itens = itens;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaNota> itens) {
		for (ItemDaNota itemDaNota : itens) {
			this.itens.add(itemDaNota);
			this.valorBruto += itemDaNota.getValor();
			this.imposto += (itemDaNota.getValor() * 0.0005);	
			}
	}
	public void setItens(ItemDaNota itemDaNota) {
			this.itens.add(itemDaNota);
			this.valorBruto += itemDaNota.getValor();
			this.imposto += (itemDaNota.getValor() * 0.0005);	
	}

	public String getNome() {
		return razaoSocial;
	}

	public void setNome(String nome) {
		this.razaoSocial = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getImposto() {
		return imposto;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
