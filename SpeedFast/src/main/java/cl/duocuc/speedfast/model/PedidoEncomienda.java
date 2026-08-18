package cl.duocuc.speedfast.model;

/**
 * Pedido de tipo Encomienda (documentos o paquetes). Requiere validación
 * de peso y embalaje antes de asignar repartidor.
 */
public class PedidoEncomienda extends Pedido {

    private double pesoKg;
    private boolean embalajeValido;

    public PedidoEncomienda(String idPedido, String direccionEntrega, double pesoKg, boolean embalajeValido) {
        super(idPedido, direccionEntrega, "Encomienda");
        this.pesoKg = pesoKg;
        this.embalajeValido = embalajeValido;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public boolean isEmbalajeValido() {
        return embalajeValido;
    }

    public void setEmbalajeValido(boolean embalajeValido) {
        this.embalajeValido = embalajeValido;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Encomienda - Pedido " + idPedido + "] Validando peso (" + pesoKg
                + " kg) y embalaje antes de asignar repartidor para " + direccionEntrega + "...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (embalajeValido && pesoKg <= 20.0) {
            System.out.println("[Encomienda - Pedido " + idPedido + "] Repartidor " + nombreRepartidor
                    + " asignado. Validación OK: peso " + pesoKg + " kg, embalaje correcto. Entrega en "
                    + direccionEntrega + ".");
        } else {
            System.out.println("[Encomienda - Pedido " + idPedido + "] Repartidor " + nombreRepartidor
                    + " asignado, pero la validación FALLÓ (peso: " + pesoKg
                    + " kg, embalaje válido: " + embalajeValido + "). Requiere revisión.");
        }
    }
}
