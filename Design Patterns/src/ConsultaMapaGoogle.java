public class ConsultaMapaGoogle implements Map {

	@Override
	public String devolveMap(String rua) {

		String googleMap = "https://www.google.com/search?q=";

		return googleMap+rua;
	}

}
