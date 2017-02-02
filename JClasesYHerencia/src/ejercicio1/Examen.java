package ejercicio1;

public class Examen {
    private String nombre;
    private String aula;
    private Fecha fecha;
    private Hora hora;
    
    public Examen (String nombre, String aula, Fecha fecha, Hora hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public String toString() {
        return "Asignatura: "+nombre+"\nAula: "+aula+"\nFecha: "+fecha+"\nHora: "+hora;
    }
}
