package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GerenciadorPedidosTest {
    GerenciadorPedidos gerenciador;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        gerenciador = new GerenciadorPedidos();
        pedido = new Pedido();
    }

    @Test
    void deveCriarPedido() {
        PedidoCommand criarPedido = new CriarPedidoCommand(pedido);
        gerenciador.adicionarPedido(criarPedido);

        assertEquals("Pedido criado", pedido.getStatus());
    }

    @Test
    void deveCancelarPedido() {
        PedidoCommand criarPedido = new CriarPedidoCommand(pedido);
        PedidoCommand cancelarPedido = new CancelarPedidoCommand(pedido);

        gerenciador.adicionarPedido(criarPedido);
        gerenciador.adicionarPedido(cancelarPedido);

        assertEquals("Pedido cancelado", pedido.getStatus());
    }

    @Test
    void deveCancelarUltimoPedido() {
        PedidoCommand criarPedido = new CriarPedidoCommand(pedido);
        PedidoCommand cancelarPedido = new CancelarPedidoCommand(pedido);

        gerenciador.adicionarPedido(criarPedido); // Cria o pedido
        gerenciador.adicionarPedido(cancelarPedido); // Cancela a criação do pedido

        gerenciador.cancelarUltimoPedido(); // Remove o último pedido cancelado

        // Agora o pedido atual é o pedido criado, não o pedido de cancelamento
        assertEquals("Pedido criado", pedido.getStatus());
    }


}
