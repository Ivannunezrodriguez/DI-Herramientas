// 3. Paquete: controller
package src.main.java.controller;

import src.main.java.model.Producto;
import src.main.java.model.Tienda;

import java.io.*;
import java.util.Scanner;

public class GestorFicheros {
    public void escribirBinarios(String path) {
        File file = new File(path);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))) {
            dataOutputStream.writeUTF("Esto es un ejemplo");
            dataOutputStream.writeInt(5);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeChar(234);
        } catch (IOException e) {
            System.out.println("Problema con el fichero: " + e.getMessage());
        }
    }

    public void lecturaBinarios(String path) {
        File file = new File(path);
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readChar());
        } catch (IOException e) {
            System.out.println("Problema con el fichero: " + e.getMessage());
        }
    }

    public void escribirObjeto(String path) {
        File file = new File(path);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(new Producto(1, "Producto1", 98.65, 1, 10, "apple"));
            objectOutputStream.writeObject(new Tienda("Tienda1", 123, 100));
        } catch (IOException e) {
            System.out.println("Error en la escritura del objeto: " + e.getMessage());
        }
    }

    public void lecturaObjeto(String path) {
        File file = new File(path);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Producto producto = (Producto) objectInputStream.readObject();
            producto.mostrarDatos();
            Tienda tienda = (Tienda) objectInputStream.readObject();
            tienda.mostrarDatos();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }
    }
}