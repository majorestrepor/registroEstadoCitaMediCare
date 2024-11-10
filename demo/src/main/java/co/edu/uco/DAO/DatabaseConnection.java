package co.edu.uco.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;

    // Configuración de la conexión
    private static final String URL = "jdbc:postgresql://localhost:1234/postgres"; // Cambia el puerto, host y base de datos según sea necesario
    private static final String USER = "postgres"; // Reemplaza con tu usuario de PostgreSQL
    private static final String PASSWORD = "majorera20"; // Reemplaza con tu contraseña

    // Constructor privado para evitar instanciación
    private DatabaseConnection() {}

    // Método para obtener la conexión
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Cargar el controlador JDBC (opcional en versiones recientes)
                Class.forName("org.postgresql.Driver");

                // Crear la conexión
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión a PostgreSQL establecida.");

            } catch (ClassNotFoundException e) {
                System.out.println("Driver de PostgreSQL no encontrado.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos:");
                e.printStackTrace();
            }
        }
        return connection;
    }
}
