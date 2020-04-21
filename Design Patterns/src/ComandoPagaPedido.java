
public class ComandoPagaPedido implements Comando{

	
	private Pedido pedido;
	
	
	
	public ComandoPagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}



	@Override
	public void execulta() {
		pedido.finaliza();
	}

}
