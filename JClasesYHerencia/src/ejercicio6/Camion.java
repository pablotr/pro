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
    
    public void quitaRemolque() {
        remolque = null;
    }
    
    @Override
    public void acelerar(int v) {
        try {
            validarAceleracion(v);
            super.acelerar(v);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String toString() {
        if (remolque != null) {
            return super.toString()+remolque;
        } else {
            return super.toString();
        }
        
    }
    
    private void validarAceleracion(int v) throws Exception {
        if (remolque != null && velocidad + v > 100) {
            throw new DemasiadoRapidoException("ERROR: Un camión no puede superar los 100km/h si lleva un remolque");
        } 
    }
}
