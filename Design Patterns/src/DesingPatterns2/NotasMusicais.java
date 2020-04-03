package DesingPatterns2;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	
	private static Map<String, Nota> MUSICA = 
			new HashMap<String, Nota>();
	
	static {

		MUSICA.put("do", new Do());
		MUSICA.put("re", new Re());
		MUSICA.put("mi", new Mi());
		MUSICA.put("fa", new Fa());
		MUSICA.put("sol", new Sol());
		MUSICA.put("la", new La());
		MUSICA.put("si", new Si());
		
		
		MUSICA.put("do#", new DoSutenido());
		MUSICA.put("re#", new ReSutenido());
		MUSICA.put("mi#", new MiSutenido());
		MUSICA.put("fa#", new FaSutenido());
		MUSICA.put("sol#", new SolSutenido());
		MUSICA.put("la#", new LaSutenido());
		MUSICA.put("si#", new SiSutenido());
	}
	
	public Nota pega(String nome) {
		return MUSICA.get(nome);
	}
}
