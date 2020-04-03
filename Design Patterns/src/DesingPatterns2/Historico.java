package DesingPatterns2;

import java.util.ArrayList;
import java.util.List;

public class  Historico {

	private  List<Contrato> historicoDeConta = new ArrayList<Contrato>();

	public void adicionaNoHistorico(Contrato contrato) {
		Contrato contratoAntigo = new Contrato(contrato.getNome(), contrato.getData());
		contratoAntigo.setEstado(contrato.getEstado());
		historicoDeConta.add(contratoAntigo);
	}

	public  Contrato historico(int posicao) {
		return historicoDeConta.get(posicao);
		

	}
}
