package cl.duocuc.speedfast.model;

/**
 * Pedido de tipo Comida (restaurantes). Requiere repartidor con
 * mochila térmica para mantener el pedido a temperatura adecuada.
 */
public class PedidoComida extends Pedido {

    private boolean requiereMochilaTermica;

    public PedidoComida(String idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
        this.requiereMochilaTermica = true;
    }

    public boolean isRequiereMochilaTermica() {
        return requiereMochilaTermica;
    }

    public void setRequiereMochilaTermica(boolean requiereMochilaTermica) {
        this.requiereMochilaTermica = requiereMochilaTermica;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Comida - Pedido " + idPedido + "] Buscando repartidor con mochila térmica "
                + "disponible para entrega en " + direccionEntrega + "...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (requiereMochilaTermica) {
            System.out.println("[Comida - Pedido " + idPedido + "] Repartidor " + nombreRepartidor
                    + " asignado. Validación OK: cuenta con mochila térmica. Entrega en "
                    + direccionEntrega + ".");
        } else {
            System.out.println("[Comida - Pedido " + idPedido + "] Repartidor " + nombreRepartidor
                    + " asignado, pero NO cuenta con mochila térmica. Se recomienda reasignar.");
        }
    }
}
