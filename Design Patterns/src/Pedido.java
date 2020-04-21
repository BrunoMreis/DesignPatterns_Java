import java.time.LocalDateTime;
import java.time.ZoneId;

public class Pedido {

	private String client;
	private double valor;
	private Status status;
	private LocalDateTime dataDeFinalizacao;

	public Pedido(String client, double valor) {

		this.client = client;
		this.valor = valor;
		this.status = Status.NOVO;
	}

	public void paga() {
			this.status = Status.PAGO;
	}

	
	public void finaliza() {
		dataDeFinalizacao = LocalDateTime.now(ZoneId.of( "America/Sao_Paulo"));
		this.status = Status.ENTREGUE; 
	}
	
	
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getDataDeFinalizacao() {
		return dataDeFinalizacao;
	}

	public void setDataDeFinalizacao(LocalDateTime dataDeFinalizacao) {
		this.dataDeFinalizacao = dataDeFinalizacao;
	}

}
