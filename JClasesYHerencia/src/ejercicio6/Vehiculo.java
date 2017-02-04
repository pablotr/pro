package ejercicio6;

public abstract class Vehiculo {
    
    protected final String matricula;
    protected int velocidad;
    
    protected Vehiculo (String matricula) {
        this.matricula = matricula;
        velocidad = 0;
    }
    
    public String toString() {
        return "Matrícula: "+matricula+"\nVelocidad: "+velocidad+" km/h\n";
    }
    
    protected void acelerar (int a) {
        this.velocidad += a;
    }
}
