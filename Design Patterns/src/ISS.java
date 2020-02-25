
public class ISS implements Imposto {
	
	
	@Override
	public double calculaImposto(double valor) {
		return valor*(6/100);
	}
	
	

}
