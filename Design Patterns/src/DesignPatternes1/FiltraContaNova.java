package DesignPatternes1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class FiltraContaNova extends Filtro {
	
	
	public FiltraContaNova() {
	}
	public FiltraContaNova(Filtro outroFiltro) {
		super(outroFiltro);
	}
	

	@Override
	public List<Conta> filtra(List<Conta> listaContas) {
		List<Conta> listaFiltrada = new ArrayList<Conta>();
		
		Calendar dataAberturaDeConta = Calendar.getInstance();
		
		for (Conta conta : listaFiltrada) {
			if(conta.getDataAberturaDeConta().MONTH == dataAberturaDeConta.MONTH &&
					conta.getDataAberturaDeConta().YEAR == dataAberturaDeConta.YEAR) {
				listaFiltrada.add(conta);
			}
		}
		
		
		listaFiltrada.addAll(proximo(listaContas));
		return listaFiltrada;
		
	}

}
