
public class TestaTemplateMethod {

	public static void main(String[] args) {
		Item item1 = new Item("Lapis", 500.0);
		Item item2 = new Item("Lapiseira", 90.0);
		
		Orcamento orcamento = new Orcamento(590.00);
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);
		
		
		TemplateMethod template1 = new IKCV();
		TemplateMethod template2 = new ICPP();
		
		System.out.println(template1.calculaImposto(orcamento));
		System.out.println(template2.calculaImposto(orcamento));
		
		

	}

}
