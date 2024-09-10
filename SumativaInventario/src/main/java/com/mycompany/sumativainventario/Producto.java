package com.mycompany.sumativainventario;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    // Constructor
    public Producto(String codigo, String nombre, String descripcion, double precio, int cantidadEnStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Get código producto
    public String getCodigo() {
        return codigo;
    }

    // Gets & sets
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public String obtenerDescripcionDetallada() {
        return nombre + ": " + descripcion + " - Precio: $" + precio + ", Stock: " + cantidadEnStock;
    }
}