package command;

public class CriarPedidoCommand implements PedidoCommand {
    private Pedido pedido;

    public CriarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.criar();
    }

    public void cancelar() {
        this.pedido.cancelarCriacao();
    }
}