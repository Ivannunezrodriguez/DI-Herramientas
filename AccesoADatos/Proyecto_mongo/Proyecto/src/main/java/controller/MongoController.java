// 3. Paquete: controller
package src.main.java.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import database.MongoDBConnection;
import model.Producto;
import model.Tienda;
import org.bson.Document;

public class MongoController {
    private final MongoDBConnection mongoDBConnection;

    public MongoController() {
        this.mongoDBConnection = new MongoDBConnection();
    }

    public void insertarProducto(Producto producto) {
        MongoCollection<Producto> collection = mongoDBConnection.getProductosCollection();
        collection.insertOne(producto);
        System.out.println("Producto insertado correctamente.");
    }

    public void listarProductos() {
        MongoCollection<Producto> collection = mongoDBConnection.getProductosCollection();
        try (MongoCursor<Producto> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                Producto producto = cursor.next();
                producto.mostrarDatos();
            }
        }
    }

    public void insertarTienda(Tienda tienda) {
        MongoCollection<Tienda> collection = mongoDBConnection.getTiendasCollection();
        collection.insertOne(tienda);
        System.out.println("Tienda insertada correctamente.");
    }

    public void listarTiendas() {
        MongoCollection<Tienda> collection = mongoDBConnection.getTiendasCollection();
        try (MongoCursor<Tienda> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                Tienda tienda = cursor.next();
                tienda.mostrarDatos();
            }
        }
    }

    public void cerrarConexion() {
        mongoDBConnection.closeConnection();
    }
}
