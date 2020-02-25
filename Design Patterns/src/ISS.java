
public class ISS implements Imposto {
	
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getTotal()*(6/100);
	}
	
	

}
