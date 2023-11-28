package command;

public class Pedido {
    private String status;

    public void criar() {
        this.status = "Pedido criado";
    }

    public void cancelarCriacao() {
        this.status = "Criação do pedido cancelada";
    }

    public boolean cancelarPedido() {
        if (this.status.equals("Pedido criado")) {
            this.status = "Pedido cancelado";
            return true;
        }
        return false; 
    }

    public void reabrir() {
        this.status = "Pedido reaberto";
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }
}