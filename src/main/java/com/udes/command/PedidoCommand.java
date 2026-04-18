package com.udes.command;

import com.udes.modelo.Pedido;

/**
 * Interfaz Command para operaciones sobre pedidos.
 * Desacopla las operaciones del procesador de pedidos.
 */
public interface PedidoCommand {
    
    /**
     * Ejecuta la operación sobre el pedido.
     * @param pedido El pedido sobre el cual ejecutar la operación
     * @return Mensaje resultado de la operación
     */
    String ejecutar(Pedido pedido);
    
    /**
     * Obtiene el nombre de la operación.
     * @return Nombre de la operación
     */
    String getNombreOperacion();
}