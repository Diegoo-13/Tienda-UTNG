import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL =
        "jdbc:sqlserver://localhost;databaseName=tienda_utng;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

    public static Connection obtenerConexion() {
        try {
            Connection conexion = DriverManager.getConnection(URL);
            System.out.println("Conexión exitosa a SQL Server.");
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error al conectar:");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        obtenerConexion();
    }
}