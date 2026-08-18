package cl.duocuc.speedfast.main;

import cl.duocuc.speedfast.model.Pedido;
import cl.duocuc.speedfast.model.PedidoComida;
import cl.duocuc.speedfast.model.PedidoEncomienda;
import cl.duocuc.speedfast.model.PedidoExpress;

/**
 * Clase principal para probar el sistema de asignación de repartidores
 * de SpeedFast, demostrando polimorfismo mediante sobrecarga y
 * sobreescritura del método asignarRepartidor().
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   SISTEMA DE REPARTO SPEEDFAST");
        System.out.println("=========================================\n");

        // Se instancia al menos un objeto de cada subclase
        Pedido pedidoComida = new PedidoComida("P001", "Av. Los Aromos 123, Puerto Varas");
        Pedido pedidoEncomienda = new PedidoEncomienda("P002", "Camino Real 456, Frutillar", 5.5, true);
        Pedido pedidoExpress = new PedidoExpress("P003", "Pasaje Las Lengas 789, Osorno", 1.2, true);

        // Un segundo caso de encomienda para mostrar validación fallida
        Pedido pedidoEncomiendaFallida = new PedidoEncomienda("P004", "Ruta 5 Sur km 3, Llanquihue", 25.0, false);

        Pedido[] pedidos = { pedidoComida, pedidoEncomienda, pedidoExpress, pedidoEncomiendaFallida };

        for (Pedido pedido : pedidos) {
            System.out.println("-----------------------------------------");
            System.out.println("Tipo de pedido: " + pedido.getTipoPedido());

            // Llamada a la versión sobrescrita (sin parámetros)
            pedido.asignarRepartidor();

            // Llamada a la versión sobrecargada (con nombre de repartidor)
            pedido.asignarRepartidor("Juan Pérez");

            System.out.println();
        }

        System.out.println("=========================================");
        System.out.println("   FIN DE LA EJECUCIÓN");
        System.out.println("=========================================");
    }
}
