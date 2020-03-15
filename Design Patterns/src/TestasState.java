
public class TestasState {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(100.00);
		
		
		System.out.println(orcamento.getTotal());
		
		orcamento.aplicaDescontoExtra();
		orcamento.aplicaDescontoExtra();
		orcamento.aplicaDescontoExtra();
		orcamento.aplicaDescontoExtra();
		orcamento.aplicaDescontoExtra();
		orcamento.aplicaDescontoExtra();
		orcamento.aplicaDescontoExtra();
		orcamento.aplicaDescontoExtra();
	
		System.out.println(orcamento.getTotal());
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		
		System.out.println(orcamento.getTotal());
		
		orcamento.finaliza();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getTotal());
	
	}
	

}
