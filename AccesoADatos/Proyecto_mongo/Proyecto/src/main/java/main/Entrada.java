// 4. Paquete: main
package src.main.java.main;


import src.main.java.controller.MongoController;
import src.main.java.model.Producto;
import src.main.java.model.Tienda;

public class Entrada {
    public static void main(String[] args) {
        MongoController controller = new MongoController();

        Producto producto = new Producto(1, "Laptop", 1200.99, 50, 10, "Dell");
        controller.insertarProducto(producto);
        System.out.println("Listado de Productos:");
        controller.listarProductos();

        Tienda tienda = new Tienda("TechStore", 101, 25);
        controller.insertarTienda(tienda);
        System.out.println("Listado de Tiendas:");
        controller.listarTiendas();

        controller.cerrarConexion();
    }
}