package DesingPatterns2;

import java.util.Arrays;
import java.util.List;

public class TestaFlyweight {

	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> doReMiFa = Arrays.asList(
	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa")    

	        );
		
		Piano.toca(doReMiFa);

	}

}
