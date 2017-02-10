package prueba;

import java.io.*;

public class AppRandomAccessFile {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JFicheros.prueba.AppRandomAcessFile");
        
        int pos = 11;
        String nombreFichero = "prueba.txt";
        RandomAccessFile raf = null;
        
        try {
            raf = new RandomAccessFile(nombreFichero, "rw");
            long tamaño = raf.length();
            raf.seek(pos);
            if (raf.getFilePointer() < tamaño) {
                int caract = raf.read();
                raf.seek((raf.getFilePointer() - 1));
                raf.write(Character.toUpperCase(caract));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura/escritura en el fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
