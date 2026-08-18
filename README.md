# SpeedFast — Sistema de Asignación de Repartidores

Proyecto de la actividad formativa **Semana 1** del curso *Desarrollo Orientado a Objetos II* (Duoc UC): *"Explorando la sobrecarga y sobreescritura en clases derivadas"*.

## Descripción

SpeedFast es una empresa de reparto a domicilio que ofrece tres tipos de servicio: **Comida**, **Encomiendas** y **Compras Express**. Cada tipo de pedido tiene criterios distintos para asignar repartidor. El proyecto implementa esta lógica usando **polimorfismo**:

- **Sobreescritura (`@Override`)**: cada subclase de `Pedido` redefine `asignarRepartidor()` con su propia lógica.
- **Sobrecarga**: se agrega la versión `asignarRepartidor(String nombreRepartidor)`, que además valida condiciones propias de cada tipo de pedido.

## Estructura del proyecto

```
src/main/java/cl/duocuc/speedfast/
├── model/
│   ├── Pedido.java              // Clase base
│   ├── PedidoComida.java        // Requiere mochila térmica
│   ├── PedidoEncomienda.java    // Requiere validación de peso y embalaje
│   └── PedidoExpress.java       // Requiere repartidor más cercano y disponible
└── main/
    └── Main.java                 // Clase de prueba
```

## Clase base: `Pedido`

Atributos: `idPedido`, `direccionEntrega`, `tipoPedido` (encapsulados con getters/setters).
Métodos:
- `asignarRepartidor()` — versión genérica.
- `asignarRepartidor(String nombreRepartidor)` — versión sobrecargada.

## Subclases

| Clase | Validación específica |
|---|---|
| `PedidoComida` | Repartidor debe contar con mochila térmica |
| `PedidoEncomienda` | Valida peso (≤ 20 kg) y embalaje correcto |
| `PedidoExpress` | Repartidor más cercano con disponibilidad inmediata |

## Cómo ejecutar

1. Abrir el proyecto en **IntelliJ IDEA**.
2. Ejecutar la clase `Main` (`src/main/java/cl/duocuc/speedfast/main/Main.java`).
3. La consola mostrará, para cada pedido, la llamada al método sobrescrito y al sobrecargado, incluyendo un caso de encomienda con validación fallida para evidenciar ambos escenarios.

## Autor

Trabajo individual — Desarrollo Orientado a Objetos II, Duoc UC.
