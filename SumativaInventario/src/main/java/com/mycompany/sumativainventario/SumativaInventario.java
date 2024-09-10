package com.mycompany.sumativainventario;

public class SumativaInventario {

    public static void main(String[] args) {
        
        MenuPrincipal menu = new MenuPrincipal();
        
        Producto producto1 = new Producto("001", "Croquetas de perro", "Alimento para perro de 10kg", 25000, 15);
        Producto producto2 = new Producto("002", "Pelota juguete", "Pelota pequeña para juego animales", 7000, 25);
        
        menu.getInventario().agregarProducto(producto1);
        menu.getInventario().agregarProducto(producto2);

        menu.iniciar();
        
        //inventario.generarInforme();
    }
}