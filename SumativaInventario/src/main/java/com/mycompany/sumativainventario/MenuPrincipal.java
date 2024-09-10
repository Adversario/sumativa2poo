package com.mycompany.sumativainventario;

import java.util.Scanner;

public class MenuPrincipal {
    private Inventario inventario;
    private Scanner scanner;

    public MenuPrincipal() {
        inventario = new Inventario();
        scanner = new Scanner(System.in);
    }
    
    public Inventario getInventario() {
        return inventario;
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    buscarProducto();
                    break;
                case 5:
                    listarProductos();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, intentar nuevamente.");
            }
        } while (opcion != 6);
    }

    private void mostrarMenu() {
        System.out.println("\n*** Gestion de Inventario de Tienda de Mascotas ***");
        System.out.println("1. Agregar producto");
        System.out.println("2. Actualizar producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Buscar producto por codigo");
        System.out.println("5. Lista de todos los productos");
        System.out.println("6. Salir");
        System.out.print("Seleccionar una opcion: ");
    }

    private void agregarProducto() {
        System.out.println("\n--- Agregar Producto ---");
        System.out.print("Codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad en stock: ");
        int cantidadEnStock = scanner.nextInt();

        Producto producto = new Producto(codigo, nombre, descripcion, precio, cantidadEnStock);
        inventario.agregarProducto(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    private void actualizarProducto() {
        System.out.println("\n--- Actualizar Producto ---");
        System.out.print("Ingresa el codigo del producto a actualizar: ");
        String codigo = scanner.nextLine();
        Producto producto = inventario.buscarProductoPorCodigo(codigo);

        if (producto != null) {
            System.out.print("Nuevo precio: ");
            double nuevoPrecio = scanner.nextDouble();
            producto.actualizarPrecio(nuevoPrecio);
            System.out.println("Precio actualizado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void eliminarProducto() {
        System.out.println("\n--- Eliminar Producto ---");
        System.out.print("Ingresa el codigo del producto a eliminar: ");
        String codigo = scanner.nextLine();
        Producto producto = inventario.buscarProductoPorCodigo(codigo);

        if (producto != null) {
            inventario.eliminarProducto(codigo);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void buscarProducto() {
        System.out.println("\n--- Buscar Producto ---");
        System.out.print("Ingresa el codigo del producto a buscar: ");
        String codigo = scanner.nextLine();
        Producto producto = inventario.buscarProductoPorCodigo(codigo);

        if (producto != null) {
            System.out.println(producto.obtenerDescripcionDetallada());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void listarProductos() {
        System.out.println("\n--- Listar Productos ---");
        inventario.generarInforme();
    }
}