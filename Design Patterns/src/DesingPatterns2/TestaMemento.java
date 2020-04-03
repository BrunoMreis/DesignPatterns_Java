package DesingPatterns2;

import java.util.Calendar;

public class TestaMemento {

	public static void main(String[] args) {

		Contrato contrato = new Contrato("Bruno", Calendar.getInstance());

		System.out.println(contrato.getEstado());
		contrato.avanca();
		System.out.println(contrato.getEstado());
		contrato.avanca();
		System.out.println(contrato.getEstado());
		contrato.avanca();
		System.out.println(contrato.getEstado());
		contrato.retorna(0);
		System.out.println(contrato.getEstado());

	}

}
