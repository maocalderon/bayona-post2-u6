package com.udes;

import com.udes.command.CancelarPedidoCommand;
import com.udes.command.CrearPedidoCommand;
import com.udes.command.PedidoCommand;
import com.udes.descuento.DescuentoFijo;
import com.udes.descuento.DescuentoPorcentaje;
import com.udes.descuento.DescuentoStrategy;
import com.udes.descuento.SinDescuento;
import com.udes.modelo.Pedido;
import com.udes.procesador.ProcesadorPedidos;

/**
 * Clase principal que demuestra el uso de los patrones Strategy y Command.
 * Mantiene baja complejidad ciclomática delegando la lógica a las clases especializadas.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Sistema de Pedidos UDES ===\n");
        
        ejecutarEjemploDescuentoFijo();
        ejecutarEjemploDescuentoPorcentaje();
        ejecutarEjemploSinDescuento();
        ejecutarEjemploCancelar();
    }
    
    private static void ejecutarEjemploDescuentoFijo() {
        DescuentoStrategy estrategia = new DescuentoFijo(50.0);
        PedidoCommand comando = new CrearPedidoCommand();
        ProcesadorPedidos procesador = new ProcesadorPedidos(estrategia, comando);
        
        Pedido pedido = new Pedido("P001", "Juan Pérez", 200.0);
        String resultado = procesador.procesar(pedido);
        
        System.out.println("Ejemplo 1 - Descuento Fijo:");
        System.out.println(resultado);
        System.out.println();
    }
    
    private static void ejecutarEjemploDescuentoPorcentaje() {
        DescuentoStrategy estrategia = new DescuentoPorcentaje(10.0);
        PedidoCommand comando = new CrearPedidoCommand();
        ProcesadorPedidos procesador = new ProcesadorPedidos(estrategia, comando);
        
        Pedido pedido = new Pedido("P002", "María García", 150.0);
        String resultado = procesador.procesar(pedido);
        
        System.out.println("Ejemplo 2 - Descuento Porcentaje:");
        System.out.println(resultado);
        System.out.println();
    }
    
    private static void ejecutarEjemploSinDescuento() {
        DescuentoStrategy estrategia = new SinDescuento();
        PedidoCommand comando = new CrearPedidoCommand();
        ProcesadorPedidos procesador = new ProcesadorPedidos(estrategia, comando);
        
        Pedido pedido = new Pedido("P003", "Carlos López", 300.0);
        String resultado = procesador.procesar(pedido);
        
        System.out.println("Ejemplo 3 - Sin Descuento:");
        System.out.println(resultado);
        System.out.println();
    }
    
    private static void ejecutarEjemploCancelar() {
        DescuentoStrategy estrategia = new SinDescuento();
        PedidoCommand comando = new CancelarPedidoCommand();
        ProcesadorPedidos procesador = new ProcesadorPedidos(estrategia, comando);
        
        Pedido pedido = new Pedido("P004", "Ana Martínez", 250.0);
        String resultado = procesador.procesar(pedido);
        
        System.out.println("Ejemplo 4 - Cancelar Pedido:");
        System.out.println(resultado);
    }
}