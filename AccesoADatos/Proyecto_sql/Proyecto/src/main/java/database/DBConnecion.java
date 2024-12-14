// 1. Paquete: database
package src.main.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecion {

    private static Connection connection;

    public Connection getConnection() {
        if (connection == null) {
            newConnection();
        }
        return connection;
    }

    private void newConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/" + SchemaDB.DB_NAME;
        try {
            connection = DriverManager.getConnection(url, "root", "");
        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
        }
        System.out.println("Conexión creada correctamente");
    }

    public void closeConnecion() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión");
        } finally {
            connection = null;
        }
    }
}
