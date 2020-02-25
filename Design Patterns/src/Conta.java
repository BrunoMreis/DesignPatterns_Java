
public class Conta {
	private double saldo;
	private String nome;

	public double getSaldo() {
		return saldo;
	}

	public void deposita (double valor) {
		this.saldo =+ valor;
	}

	public String getNomeTitular() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
	

}
