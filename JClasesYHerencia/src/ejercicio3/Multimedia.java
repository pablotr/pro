package ejercicio3;

import java.util.Scanner;

abstract public class Multimedia {
    
    private final String titulo;
    private final String autor;
    private final String formato;
    private final int duracion;
    public final static Scanner INPUT = new Scanner(System.in);
    
    protected Multimedia (String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }
    
    protected String getTitulo() {
        return titulo;
    }
    
    protected String getAutor() {
        return autor;
    }
    
    protected String getFormato() {
        return formato;
    }
    
    protected int getDuracion() {
        return duracion;
    }
    
    @Override
    public String toString() {
        return "Título: "+titulo+"\nAutor: "+autor+"\nFormato: "+formato+"\nDuración: "+duracion+" min\n";
    }
    
    protected boolean equals(Multimedia multi) {
        return multi.titulo.equals(titulo) && multi.autor.equals(autor);
    }
    
    protected static Multimedia inputMedia() {
        return null;
    }
    
    protected static boolean testDuracion(String duracion) {
        boolean x = false;
        try {
            Integer.parseInt(duracion);
        } catch (NumberFormatException e) {
            System.out.println("Introduzca la duración con el formato adecuado, usando únicamente números");
        }
        return x;
    }
}
