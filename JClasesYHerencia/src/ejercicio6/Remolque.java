package ejercicio6;

public class Remolque {
    
    private final int peso;
    
    public Remolque(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Peso(remolque): "+peso+" kg\n";
    }
}
