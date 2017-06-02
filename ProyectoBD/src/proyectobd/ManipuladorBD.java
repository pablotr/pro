package proyectobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pablotr
 */
public class ManipuladorBD {
     
    private Connection conn;
    private Statement st;
    
    private String server = "localhost";
    private String port = "3306";
    private String bd = "videoclub";
    private String user = "root";
    private String pass = "@5paki2@";
    private final String URL = "jdbc:mysql://" + server + ":" + port + "/" + bd;
    private String outbox;
    
    public ManipuladorBD() {
        conn = null;
        st = null;
        
        server = "localhost";
        port = "3306";
        String bd = "videoclub";
        String user = "root";
        String pass = "@5paki2@";
    }
    
    public String getOutbox() {
        return outbox;
    }
    
    public boolean conectar() {
        boolean x = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(URL, user, pass);
                x = true;
            } catch (SQLException sqlE) {
                System.err.println("ERROR: ManipuladorBD.conectar()");
                System.err.println("No se ha podido conectar con la BD " + bd);
                System.err.println(sqlE.getMessage());
                outbox = "No se ha podido conectar con la BD " + bd;
            } 
        } catch (ClassNotFoundException cnfE) {
            System.err.println("ERROR: ManipuladorBD.conectar()");
            System.err.println("No se encontró el Driver de Conexión con MySQL");
            System.err.println(cnfE.getMessage());
            outbox = "No se encontró el Driver de Conexión con MySQL";
        }
        
        return x;
    }
    
    public boolean desconectar() {
        boolean x = false;
        try {
            conn.close();
            x = true;
        } catch (SQLException sqlE) {
            System.err.println("ERROR: ManipuladorBD.desconectar()");
            System.err.println("No se pudo desconectar de la BD " + bd);
            System.err.println(sqlE.getMessage());
            outbox = "No se pudo desconectar de la BD " + bd;
        }
        return x;
    }
    
    public boolean ejecutar(String query) {
        boolean x = false;
        try {
            st = conn.createStatement();
            st.execute(query);
            st.close();
            x = true;
        } catch (SQLException sqlE) {
            System.err.println("ERROR: ManipuladorBD.ejecutar(query)");
            System.err.println("Ha habido algun tipo de problema al ejecutar " +
                    "la query especificada");
            System.err.println(sqlE.getMessage());
        }
        return x;
    }
    
   
}
