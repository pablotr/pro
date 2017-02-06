package ejercicio4;

abstract public class Coche {
    
    protected final String matricula;
    protected int marcha;
    protected int velocidad;
    
    protected Coche (String matricula) {
        this.matricula = matricula;
        marcha = 0;
        velocidad = 0;
    }
    
    protected String getMatricula() {
        return matricula;
    }
    
    protected int getMarcha() {
        return marcha;
    }
    
    protected int getVelocidad() {
        return velocidad;
    }
    
    protected void acelerar(int v) {
        velocidad += v;
    }
    
    protected void frenar(int v) {
        if (validarFrenada(v)) {
            velocidad -= v;
        }
    } 
    
    @Override
    public String toString() {
        return "Matrícula: "+matricula+"\nMarcha: "+marcha+"\nVelocidad: "+velocidad+"\n";
    }
    
    protected void cambiarMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    private boolean validarFrenada(int v) {
        boolean x;
        try {
            if (v > velocidad) {
                throw new Exception("La marcha atrás no está permitada: no puedes desacelerar tanto");
            }
            x = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            x = false;
        }
        return x;
    }
}
