package prueba;

import java.io.*;

public class AppBufferedWriter {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JFicheros.prueba.AppBufferedWriter\n");
        
        String nombreFichero = "nuevo.txt";
        String texto = "Texto de prueba";
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter(nombreFichero));
            bw.write(texto);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Error de escritura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
