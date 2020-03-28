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
		
	}
	
	public Nota pega(String nome) {
		return MUSICA.get(nome);
	}
}
