package DesingPatterns2;

import java.util.Calendar;

public class Contrato {

	private String nome;
	private EstadoDoContrato estado;
	private Calendar data;
	private Historico historico = new Historico();
	

	public Contrato(String nome, Calendar data) {
		super();
		this.nome = nome;
		this.estado = EstadoDoContrato.NOVO;
		this.data = data;

	}

	// poderia implementar padrão states.
	public void avanca() {
		historico.adicionaNoHistorico(this);
		if (this.estado == EstadoDoContrato.NOVO) {
			this.estado = EstadoDoContrato.EM_ANDAMENTO;
		} else if (this.estado == EstadoDoContrato.EM_ANDAMENTO) {
			this.estado = EstadoDoContrato.ACERTADO;
		} else if (this.estado == EstadoDoContrato.ACERTADO) {
			this.estado = EstadoDoContrato.CONCLUIDO;
		} else
			throw new IllegalStateException("Estado Invalido ou concluido");
	}
	


	public void retorna(int posicao) {
		Contrato estadoAntigo = historico.historico(posicao);
		this.nome = estadoAntigo.getNome();
		this.data = estadoAntigo.getData();
		this.estado = estadoAntigo.getEstado();
	}
	
	public void setEstado(EstadoDoContrato estado) {
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}

	public EstadoDoContrato getEstado() {
		return estado;
	}

	public Calendar getData() {
		return data;
	}

}
