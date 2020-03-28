package DesignPatternes1;

public class ItensDaNotaBuilder {
		
	private String descricao;
	private double valor;
	
	
	
	public ItensDaNotaBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	
	public ItensDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	
	public ItemDaNota constroi() {
		return new ItemDaNota(descricao, valor);
	}
}
