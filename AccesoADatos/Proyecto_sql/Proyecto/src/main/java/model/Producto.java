// 2. Paquete: model
package src.main.java.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable {
    @Serial
    private static final long serialVersionUID = 23456L;
    private int id;
    private String title;
    private double price;
    private int stock;
    private int discount;
    private String brand;

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}