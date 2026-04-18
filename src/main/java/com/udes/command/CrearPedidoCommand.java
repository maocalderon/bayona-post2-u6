package com.udes.command;

import com.udes.modelo.Pedido;

/**
 * Command para crear un nuevo pedido.
 * Registra la creación del pedido en el sistema.
 */
public class CrearPedidoCommand implements PedidoCommand {
    
    @Override
    public String ejecutar(Pedido pedido) {
        return "Pedido creado: ID=" + pedido.getId() + 
               ", Cliente=" + pedido.getCliente() + 
               ", Monto=$" + pedido.getMontoTotal();
    }
    
    @Override
    public String getNombreOperacion() {
        return "Crear Pedido";
    }
}