package DesignPatternes1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class FiltraMaior5Mil extends Filtro {
	
	public FiltraMaior5Mil(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltraMaior5Mil() {
	}
	
	

	@Override
	public List<Conta> filtra(List<Conta> listaContas) {
		List<Conta> listaFiltrada = new ArrayList<>();

		for (Conta conta : listaFiltrada) {
			if (conta.getSaldo() > 5000.0) {
				listaFiltrada.add(conta);
			}
		}
		listaFiltrada.addAll(proximo(listaContas));
		return listaFiltrada;
	}

}
