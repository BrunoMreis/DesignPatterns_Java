
public class ComandoFinalizaPedido implements Comando {
	
	private Pedido pedido;

	public ComandoFinalizaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void execulta() {
		pedido.paga();
		
	}

}
