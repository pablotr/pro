package ejerciciobd.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;

/**
 *
 * @author pablotr
 */
public class ConectorVideoclub {
    
    public Connection conn;
    
    private final String SERVER = "localhost";
    private final String PORT = "3306";
    private final String BD = "videoclub";
    private final String USER = "root";
    private final String PASS = "@5paki2@";
    private final String URL = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + BD;
    
    public ConectorVideoclub() {
        this.conn = null;
    }
    
    public boolean connect() {
        boolean x = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(URL, USER, PASS);
                x = true;
            } catch (SQLException sqlE) {
                System.err.println("ERROR: ConectarVideoclub.conectar()");
                System.err.println("No se ha podido conectar con la BD " + BD);
                System.err.println(sqlE.getMessage());
            } 
        } catch (ClassNotFoundException cnfE) {
            System.err.println("ERROR: ConectarVideoclub.conectar()");
            System.err.println("No se encontró el Driver de Conexión con MySQL");
            System.err.println(cnfE.getMessage());
        }
        return x;
    }
}
