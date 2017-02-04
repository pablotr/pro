package ejercicio6;

public class Coche extends Vehiculo {
    
    private final int puertas;
    
    public Coche (String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }
    
    public int getPuertas() {
        return puertas;
    }
}
