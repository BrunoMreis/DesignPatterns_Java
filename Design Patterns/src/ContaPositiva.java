
public class ContaPositiva implements EstadoDaConta {

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo =+ valor -(valor * 0.002);
		
	}

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo =- valor;
		if(conta.saldo< 0) {
			conta.estadoAtual = new ContaPositiva();
		}
	}

}
