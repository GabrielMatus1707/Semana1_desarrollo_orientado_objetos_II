package cl.duocuc.speedfast.model;

/**
 * Pedido de tipo Compra Express (supermercado o farmacia). Debe asignarse
 * al repartidor más cercano con disponibilidad inmediata.
 */
public class PedidoExpress extends Pedido {

    private double distanciaRepartidorKm;
    private boolean disponibilidadInmediata;

    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaRepartidorKm,
                          boolean disponibilidadInmediata) {
        super(idPedido, direccionEntrega, "Compra Express");
        this.distanciaRepartidorKm = distanciaRepartidorKm;
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    public double getDistanciaRepartidorKm() {
        return distanciaRepartidorKm;
    }

    public void setDistanciaRepartidorKm(double distanciaRepartidorKm) {
        this.distanciaRepartidorKm = distanciaRepartidorKm;
    }

    public boolean isDisponibilidadInmediata() {
        return disponibilidadInmediata;
    }

    public void setDisponibilidadInmediata(boolean disponibilidadInmediata) {
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Compra Express - Pedido " + idPedido + "] Buscando repartidor más cercano "
                + "con disponibilidad inmediata para " + direccionEntrega + "...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (disponibilidadInmediata) {
            System.out.println("[Compra Express - Pedido " + idPedido + "] Repartidor " + nombreRepartidor
                    + " asignado. Validación OK: se encuentra a " + distanciaRepartidorKm
                    + " km y con disponibilidad inmediata. Entrega en " + direccionEntrega + ".");
        } else {
            System.out.println("[Compra Express - Pedido " + idPedido + "] Repartidor " + nombreRepartidor
                    + " asignado, pero NO tiene disponibilidad inmediata. Se recomienda buscar otro repartidor.");
        }
    }
}
