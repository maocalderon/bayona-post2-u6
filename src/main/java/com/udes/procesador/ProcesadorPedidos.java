package com.udes.procesador;

import com.udes.command.PedidoCommand;
import com.udes.descuento.DescuentoStrategy;
import com.udes.modelo.Pedido;

/**
 * Procesador de pedidos que utiliza inyección de dependencias.
 * Cumple con el Principio de Inyección de Dependencias y OCP.
 */
public class ProcesadorPedidos {
    
    private final DescuentoStrategy estrategiaDescuento;
    private final PedidoCommand comando;
    
    /**
     * Constructor con inyección de dependencias.
     * @param estrategiaDescuento La estrategia de descuento a utilizar
     * @param comando El comando a ejecutar sobre el pedido
     */
    public ProcesadorPedidos(DescuentoStrategy estrategiaDescuento, PedidoCommand comando) {
        this.estrategiaDescuento = estrategiaDescuento;
        this.comando = comando;
    }
    
    /**
     * Procesa un pedido aplicando descuento y ejecutando comando.
     * @param pedido El pedido a procesar
     * @return Resultado del procesamiento
     */
    public String procesar(Pedido pedido) {
        double montoConDescuento = estrategiaDescuento.aplicarDescuento(pedido.getMontoTotal());
        String resultadoComando = comando.ejecutar(pedido);
        
        return resultadoComando + " | Descuento: " + 
               estrategiaDescuento.getDescripcion() + 
               " | Monto Final: $" + montoConDescuento;
    }
    
    /**
     * Obtiene la estrategia de descuento actual.
     * @return La estrategia de descuento
     */
    public DescuentoStrategy getEstrategiaDescuento() {
        return estrategiaDescuento;
    }
    
    /**
     * Obtiene el comando actual.
     * @return El comando
     */
    public PedidoCommand getComando() {
        return comando;
    }
}