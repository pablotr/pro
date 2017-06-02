package ejerciciobd.modelos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author pablotr
 */
public class CrearTabla {
    
    public static Statement st = null;
    
    private static boolean ejecutar(String query, Connection conn) {
        boolean x = false;
        try {
            st = conn.createStatement();
            st.execute(query);
            st.close();
            x = true;
        } catch (SQLException sqlE) {
            System.err.println("ERROR: CrearTabla.ejecutar(query,conn)");
            System.err.println("Ha habido algun tipo de problema al ejecutar " +
                    "la query especificada");
            System.err.println(sqlE.getMessage());
        }
        return x;
    }
    
    public static boolean musica(Connection conn) {
        boolean x = false;
        String queryDrop = ""
                + "DROP TABLE IF EXISTS musica";
        String queryCreate = ""
                + "CREATE TABLE IF NOT EXISTS musica ("
                    + "id INT PRIMARY KEY auto_increment, "
                    + "titulo VARCHAR(50) NOT NULL, "
                    + "autor VARCHAR(50), "
                    + "duracion TIME"
                + ") ENGINE=InnoDB";
        if (ejecutar(queryDrop, conn) && ejecutar(queryCreate, conn)) {
            x = true;
        }
        return x;
    }
    
}
