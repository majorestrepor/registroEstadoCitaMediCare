package co.edu.uco.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;


    private static final String URL = "jdbc:postgresql://autorack.proxy.rlwy.net:56055/railway";
    private static final String USER = "postgres";
    private static final String PASSWORD = "tBalNSDvxhMcpCawMiflbDnabnwdNfXV";


    private DatabaseConnection() {}


    public static Connection getConnection() {
        if (connection == null) {
            try {

                Class.forName("org.postgresql.Driver");


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
