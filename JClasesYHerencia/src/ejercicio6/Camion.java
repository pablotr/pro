package ejercicio6;

public class Camion extends Vehiculo {
    
    private Remolque remolque;
    
    public Camion (String matricula) {
        super(matricula);
        remolque = null;
    }
    
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
    
    public void quitaRemolque () {
        remolque = null;
    }
    
    @Override
    public void acelerar(int a) {
        try {
            if (remolque != null && velocidad + a > 100) {
                throw new DemasiadoRapidoException("ERROR: Un camión no puede superar los 100km/h si lleva un remolque");
            }
            super.acelerar(a);
        } catch (DemasiadoRapidoException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+remolque;
    }
}
