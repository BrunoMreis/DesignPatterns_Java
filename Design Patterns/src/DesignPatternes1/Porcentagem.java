

public class Porcentagem implements Resposta {
	Resposta proximaResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(Formato.PORCENTO == req.getFormato()) {
			System.out.println(conta.getNomeTitular()+"%"+conta.getSaldo()+"%");
			
			
		}else {
			proximaResposta.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximaResposta = resposta;

	}

}
