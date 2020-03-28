package DesignPatternes1;

public class RealizadorDeInvestimentos {
		
	public RealizadorDeInvestimentos(Conta conta, Investidor investidor) {
		conta.deposita(investidor.rentabilidade(conta.getSaldo())*0.75);
	}
	
	
	
	

}
