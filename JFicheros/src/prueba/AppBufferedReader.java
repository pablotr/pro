package prueba;

import java.io.*;

public class AppBufferedReader {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JFicheros.prueba.AppBufferedReader\n");
        
        String nombreFichero = "prueba.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(nombreFichero));
            String texto = br.readLine();
            while (texto != null) {
                System.out.println(texto);
                texto = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
