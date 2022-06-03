package conexion.Oracle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author IBERO
 */
public class ConexionOracle {
    // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static String driver = "oracle.jdbc.driver.OracleDriver";
    private static String user = "system";
    private static String pass = "12345";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    DriverManager driverManager;

    public static void main(String[] args) {
        // Reseteamos a null la conexion a la bd
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                System.out.println("Conexion establecida");
            }
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion " + e);
        }
        
    }

}
