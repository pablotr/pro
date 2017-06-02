package ejerciciobd;

import ejerciciobd.modelos.CrearTabla;
import ejerciciobd.servicios.ConectorVideoclub;

/**
 *
 * @author pablotr
 */
public class Main {

    public static void main(String[] args) {
        
        ConectorVideoclub cv = new ConectorVideoclub();
        
        System.out.println("[] Conectando con la base de datos 'videoclub' ....");
        if (cv.connect()) {
            System.out.println("[X] Conexión exitosa con la BD 'videoclub'");
            System.out.println("[] Creando tabla 'musica' ....");
            if (CrearTabla.musica(cv.conn)) {
                System.out.println("[X] Tabla 'musica' creada exitosamente");
            } else {
                System.err.println("[] Fallo en la creación de la tabla 'musica'");
            }
        } else {
            System.err.println("[] Fallo en la conexión con la BD 'videoclub'");
        }
        
        
    }
    
}
