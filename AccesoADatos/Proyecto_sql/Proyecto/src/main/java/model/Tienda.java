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
public class Tienda implements Serializable {
    @Serial
    private static final long serialVersionUID = 1234L;
    private String nombre;
    private int id;
    private int empleados;

    public Tienda(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Empleados: " + empleados);
    }
}