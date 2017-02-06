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
    public void acelerar(int v) {
        if (validarAceleracion(v)) {
            super.acelerar(v);
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+remolque;
    }
    
    private boolean validarAceleracion(int v) {
        boolean x;
        try {
            if (remolque != null && velocidad + v > 100) {
                throw new DemasiadoRapidoException("ERROR: Un camión no puede superar los 100km/h si lleva un remolque");
            }
            x = true;
        } catch (DemasiadoRapidoException e) {
            System.out.println(e.getMessage());
            x = false;
        }
        return x;
    }
}
