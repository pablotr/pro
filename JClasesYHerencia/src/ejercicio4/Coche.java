package ejercicio4;

abstract public class Coche {
    
    protected final String matricula;
    protected int marcha;
    protected int velocidad;
    
    protected Coche (String matricula) {
        this.matricula = matricula;
        this.marcha = 0;
        this.velocidad = 0;
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
        this.velocidad += v;
    }
    
    protected void frenar(int v) {
        try {
            if (this.velocidad - v < 0) {
                throw new Exception("La marcha atrás no está permitada: no puedes desacelerar tanto");
            }
            this.velocidad -= v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    
    public String toString() {
        return "Matrícula: "+matricula+"\nMarcha: "+marcha+"\nVelocidad: "+velocidad+"\n";
    }
    
    protected void cambiarMarcha(int marcha) {
        this.marcha = marcha;
    }
}
