import java.util.Calendar;

public class Conta {
	private double saldo;
	private String nomeTitular;
	private String nomeBanco;
	private String telefoneBanco;
	private String enderecoBanco;
	private String emailBanco;
	private String agencia;
	private String numeroConta;
	
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
		this.saldo =+ valor;
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
