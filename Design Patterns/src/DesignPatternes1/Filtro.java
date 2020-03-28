package DesignPatternes1;
import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	final Filtro outroFiltro;
	
	public Filtro() {
		outroFiltro = null;
	}
	
	
	public Filtro(Filtro outroFiltro) {
		
		this.outroFiltro = outroFiltro;
	}


	public abstract List<Conta> filtra (List<Conta> listaContas);
	
	public 	List<Conta> proximo(List<Conta> listaContas){
		
		if(outroFiltro==null) {
			return new ArrayList<Conta>();
		}
		
		return outroFiltro.filtra(listaContas);
		
	}

}
