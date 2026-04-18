package com.udes.descuento;

/**
 * Interfaz Strategy para aplicar descuentos a pedidos.
 * Cumple con el Principio Abierto-Cerrado (OCP).
 */
public interface DescuentoStrategy {
    
    /**
     * Calcula el monto con descuento aplicado.
     * @param montoOriginal El monto sin descuento
     * @return El monto con descuento aplicado
     */
    double aplicarDescuento(double montoOriginal);
    
    /**
     * Obtiene la descripción del tipo de descuento.
     * @return Descripción del descuento
     */
    String getDescripcion();
}