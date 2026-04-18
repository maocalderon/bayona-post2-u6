package com.udes.descuento;

/**
 * Estrategia de descuento por porcentaje.
 * Aplica un porcentaje de descuento al monto original.
 */
public class DescuentoPorcentaje implements DescuentoStrategy {
    
    private final double porcentaje;
    
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double aplicarDescuento(double montoOriginal) {
        double descuento = montoOriginal * (porcentaje / 100);
        return montoOriginal - descuento;
    }
    
    @Override
    public String getDescripcion() {
        return "Descuento del " + porcentaje + "%";
    }
}