package DesignPatternes1;

public class ContaNegativa implements EstadoDaConta {

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo =+ valor -(valor * 0.005);
		
		if(conta.saldo>= 0) {
			conta.estadoAtual = new ContaPositiva();
		}
	}

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Conta Negativa");

	}

}
