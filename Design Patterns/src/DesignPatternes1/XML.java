
public class XML implements Resposta {

	Resposta proximaResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.XML == req.getFormato()) {
			System.out.println("<conta><titular>" + conta.getNomeTitular() + "</conta></titular><saldo>"
					+ conta.getSaldo() + "</saldo>");
		} else {
			proximaResposta.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximaResposta = resposta;
	}

}
