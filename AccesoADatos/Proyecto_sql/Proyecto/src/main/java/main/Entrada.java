// Proyecto: Sistema de Gestión de Usuarios y Concesionarios







// 4. Paquete: main
package src.main.java.main;


import src.main.java.controller.GestorFicheros;

public class Entrada {
    public static void main(String[] args) {
        GestorFicheros gestorFicheros = new GestorFicheros();
        gestorFicheros.escribirBinarios("src/main/java/resources/datos.bin");
        gestorFicheros.lecturaBinarios("src/main/java/resources/datos.bin");
        gestorFicheros.escribirObjeto("src/main/java/resources/objetos.obj");
        gestorFicheros.lecturaObjeto("src/main/java/resources/objetos.obj");
    }
}
