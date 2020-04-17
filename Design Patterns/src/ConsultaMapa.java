
public class ConsultaMapa {
	public static void main(String[] args) {

		Map googleMap = new ConsultaMapaGoogle();
		
		googleMap.devolveMap("rua Vergueiro");
		
	}

}
