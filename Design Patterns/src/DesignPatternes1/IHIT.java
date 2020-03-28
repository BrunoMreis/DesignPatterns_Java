package DesignPatternes1;
import java.util.HashSet;
import java.util.Set;

public class IHIT extends TemplateMethod {
	
	public IHIT() {
	}
	
	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}
	
	

	@Override
	protected double maximoTaxamento(Orcamento orcamento) {
		return (orcamento.getTotal() * 0.13) + 100.00+ calculaOutroImposto(orcamento);
	}

	@Override
	protected double minimoTaxamento(Orcamento orcamento) {
		return orcamento.getTotal() * 0.01 * orcamento.quantidadeDeItens + calculaOutroImposto(orcamento);
	}

	@Override
	protected boolean deveSerMinimoTaxamento(Orcamento orcamento) {
		if(testaNomeRepetido(orcamento)) {
			return false;
		}
		return true;
	}

	private boolean testaNomeRepetido(Orcamento orcamento) {
		Set<String> set = new HashSet<>();
		
		for (Item item : orcamento.getLista()) {
			set.add(item.getNome());
		}
		
		
		if(orcamento.getLista().size() == set.size()) {
			return false;//não tem repetição 
		}else {
		
		return true;// tem nome repetido 
		}
	}

}
