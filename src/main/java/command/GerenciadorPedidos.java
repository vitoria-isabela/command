package command;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private List<PedidoCommand> pedidos = new ArrayList<>();

    public void adicionarPedido(PedidoCommand pedido) {
        this.pedidos.add(pedido);
        pedido.executar();
    }

    public void cancelarUltimoPedido() {
        if (!pedidos.isEmpty()) {
            PedidoCommand pedido = this.pedidos.remove(this.pedidos.size() - 1);
            pedido.cancelar();
        }
    }
}