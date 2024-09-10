package com.mycompany.sumativainventario;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    // Agregar productos
    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    // Buscar productos
    public Producto buscarProductoPorCodigo(String codigo) {
        return productos.get(codigo);
    }

    // Eliminar productos
    public void eliminarProducto(String codigo) {
        productos.remove(codigo);
    }

    // Informe inventario
    public void generarInforme() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio!");
        } else {
            for (Producto producto : productos.values()) {
                System.out.println(producto.obtenerDescripcionDetallada());
            }
        }
    }
}