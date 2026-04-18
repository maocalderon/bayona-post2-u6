package com.udes.descuento;

/**
 * Estrategia de descuento de monto fijo.
 * Aplica un descuento de cantidad fija al monto original.
 */
public class DescuentoFijo implements DescuentoStrategy {
    
    private final double montoDescuento;
    
    public DescuentoFijo(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }
    
    @Override
    public double aplicarDescuento(double montoOriginal) {
        double resultado = montoOriginal - montoDescuento;
        return Math.max(resultado, 0);
    }
    
    @Override
    public String getDescripcion() {
        return "Descuento Fijo de $" + montoDescuento;
    }
}