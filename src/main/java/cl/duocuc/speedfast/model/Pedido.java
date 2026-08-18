package cl.duocuc.speedfast.model;

/**
 * Clase base que representa un pedido genérico dentro del sistema SpeedFast.
 * Define los atributos comunes a todo tipo de pedido y un método
 * asignarRepartidor() genérico que las subclases sobrescriben (polimorfismo
 * por sobreescritura), además de una versión sobrecargada que reciben
 * el nombre del repartidor (polimorfismo por sobrecarga).
 */
public class Pedido {

    protected String idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(String idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // ----- Getters y Setters -----

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    /**
     * Versión genérica (base) del método. Las subclases la sobrescriben
     * (@Override) para aplicar la lógica de asignación propia de cada
     * tipo de pedido.
     */
    public void asignarRepartidor() {
        System.out.println("[Pedido " + idPedido + "] Buscando repartidor disponible para entrega en "
                + direccionEntrega + "...");
    }

    /**
     * Versión sobrecargada: recibe el nombre del repartidor ya asignado
     * e imprime un mensaje base de confirmación. Las subclases sobrescriben
     * esta versión también, agregando las validaciones propias de su tipo
     * (mochila térmica, peso/embalaje, cercanía, etc.).
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido " + idPedido + "] Repartidor " + nombreRepartidor
                + " asignado para entrega en " + direccionEntrega + ".");
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido='" + idPedido + '\'' +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", tipoPedido='" + tipoPedido + '\'' +
                '}';
    }
}
