package src.main.java.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tienda implements Serializable {
    @BsonProperty("nombre")
    private String nombre;
    @BsonProperty("id")
    private int id;
    @BsonProperty("empleados")
    private int empleados;

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Empleados: " + empleados);
    }
}