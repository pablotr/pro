package prueba;

import java.io.*;

public class AppWriter {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JFicheros.prueba.AppWriter\n");
        
        String nombreFichero = "nuevo.txt";
        FileWriter fw = null;
        
        try {
            fw = new FileWriter(nombreFichero);
            for (char c = 'A'; c <= 'Z'; c++) {
                fw.write(c);
            }
        } catch (Exception e) {
            System.out.println("Error de escritura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.toString());
            }
        }
    }
}
