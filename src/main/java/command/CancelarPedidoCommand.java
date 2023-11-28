package command;

public class CancelarPedidoCommand implements PedidoCommand {
    private Pedido pedido;
    private String statusAnterior;

    public CancelarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.statusAnterior = this.pedido.getStatus(); 
        this.pedido.cancelarPedido();
    }

    public void cancelar() {
        this.pedido.setStatus(this.statusAnterior);
    }
}
