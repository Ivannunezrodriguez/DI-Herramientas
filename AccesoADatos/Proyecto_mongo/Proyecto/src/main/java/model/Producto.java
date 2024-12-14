// 2. Paquete: model
package src.main.java.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable {
    @BsonProperty("id")
    private int id;
    @BsonProperty("title")
    private String title;
    @BsonProperty("price")
    private double price;
    @BsonProperty("stock")
    private int stock;
    @BsonProperty("discount")
    private int discount;
    @BsonProperty("brand")
    private String brand;

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}