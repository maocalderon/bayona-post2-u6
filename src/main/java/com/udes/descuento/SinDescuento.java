package com.udes.descuento;

/**
 * Estrategia sin descuento.
 * No aplica ninguna reducción al monto original.
 */
public class SinDescuento implements DescuentoStrategy {
    
    @Override
    public double aplicarDescuento(double montoOriginal) {
        return montoOriginal;
    }
    
    @Override
    public String getDescripcion() {
        return "Sin Descuento";
    }
}