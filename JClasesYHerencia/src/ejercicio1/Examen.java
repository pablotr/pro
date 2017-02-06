package ejercicio1;

public class Examen {
    private final String nombre;
    private final String aula;
    private final Fecha fecha;
    private final Hora hora;
    
    public Examen (String nombre, String aula, Fecha fecha, Hora hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return "Asignatura: "+nombre+"\nAula: "+aula+"\nFecha: "+fecha+"\nHora: "+hora+"\n";
    }
}
