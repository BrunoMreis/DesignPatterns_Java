
public class ContaNegativa implements EstadoDaConta {

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo =+ valor -(valor * 0.005);
	}

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Conta Negativa");

	}

}
