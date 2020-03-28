import java.util.ArrayList;
import java.util.List;

public class FiltraMenor100 extends Filtro {
	
	
	public FiltraMenor100() {
		// TODO Auto-generated constructor stub
	}
	
	public FiltraMenor100(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta>  listaContas) {
		List<Conta> listaFiltrada = new ArrayList<>();

		for (Conta conta : listaFiltrada) {
			if (conta.getSaldo() < 100.0) {
				listaFiltrada.add(conta);
			}
		}
		listaFiltrada.addAll(proximo(listaContas));
		return listaFiltrada;
	}

}
