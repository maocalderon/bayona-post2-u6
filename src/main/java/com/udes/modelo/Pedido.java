package com.udes.modelo;

/**
 * Entidad simple que representa un pedido.
 * Solo contiene datos: id, cliente y monto total.
 */
public class Pedido {
    
    private final String id;
    private final String cliente;
    private final double montoTotal;
    
    public Pedido(String id, String cliente, double montoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
    }
    
    public String getId() {
        return id;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public double getMontoTotal() {
        return montoTotal;
    }
}