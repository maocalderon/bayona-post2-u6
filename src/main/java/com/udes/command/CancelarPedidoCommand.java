package com.udes.command;

import com.udes.modelo.Pedido;

/**
 * Command para cancelar un pedido existente.
 * Registra la cancelación del pedido en el sistema.
 */
public class CancelarPedidoCommand implements PedidoCommand {
    
    @Override
    public String ejecutar(Pedido pedido) {
        return "Pedido cancelado: ID=" + pedido.getId() + 
               ", Cliente=" + pedido.getCliente();
    }
    
    @Override
    public String getNombreOperacion() {
        return "Cancelar Pedido";
    }
}