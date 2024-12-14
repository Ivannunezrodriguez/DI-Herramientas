// 1. Paquete: database
package src.main.java.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.Producto;
import model.Tienda;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.pojo.PojoCodecProvider;

public class MongoDBConnection {
    private final String uri = "mongodb://127.0.0.1:27017";
    private final MongoClient mongoClient;
    private final CodecRegistry codecRegistry;

    public MongoDBConnection() {
        codecRegistry = CodecRegistries.fromRegistries(
                MongoClients.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
        );
        mongoClient = MongoClients.create(uri);
    }

    public MongoCollection<Producto> getProductosCollection() {
        MongoDatabase database = mongoClient.getDatabase("concesionario").withCodecRegistry(codecRegistry);
        return database.getCollection("productos", Producto.class);
    }

    public MongoCollection<Tienda> getTiendasCollection() {
        MongoDatabase database = mongoClient.getDatabase("concesionario").withCodecRegistry(codecRegistry);
        return database.getCollection("tiendas", Tienda.class);
    }

    public void closeConnection() {
        mongoClient.close();
    }
}