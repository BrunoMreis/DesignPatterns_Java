import java.util.Calendar;

public  class Conta {
	protected double saldo;
	protected String nomeTitular;
	protected String nomeBanco;
	protected String telefoneBanco;
	protected String enderecoBanco;
	protected String emailBanco;
	protected String agencia;
	protected String numeroConta;
	
	protected EstadoDaConta estadoAtual;
	
	private Calendar dataAberturaDeConta;
	
	
	
	

	public Calendar getDataAberturaDeConta() {
		return dataAberturaDeConta;
	}

	public void setDataAberturaDeConta(Calendar dataAberturaDeConta) {
		this.dataAberturaDeConta = dataAberturaDeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita (double valor) {
		estadoAtual.deposita(this, valor);
	}
	
	public void saca( double valor) {
		estadoAtual.saca(this, valor);
	}

	public String getNomeTitular() {
		return this.nomeTitular;
	}

	public String getNomeBanco() {
		return this.nomeBanco;
	}

	public String getTelefoneBanco() {
		return this.telefoneBanco;
	}

	public String getEnderecoBanco() {
		return this.enderecoBanco;
	}

	public String getEmailBanco() {
		return this.emailBanco;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}
	
	

}
