package DesingPatterns2;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {
	
	public static void toca(List<Nota> notas) {
		Player play = new Player();
		StringBuilder musica = new StringBuilder();
		for (Nota nota : notas) {
			musica.append(nota.simbolo()+" ");
		}
		play.play(musica.toString());
		System.out.println(musica);
	}

}
