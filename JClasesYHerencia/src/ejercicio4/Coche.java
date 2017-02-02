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
    
    protected boolean testFrenar(int a) {
        boolean x = false;
        try {
            if (frenar(a)<0) {
                throw new Exception("No se permite la marcha atrás (velocidad negativa)");
            }
            x = true;
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return x; 
    }
    
    protected boolean testMarcha(int marchaOVelocidad) {
        boolean x = false;
        try {
            if (marchaOVelocidad<0) {
                throw new Exception("No se permite la marcha atrás (velocidad o marcha negativa)");
            }
            x = true;
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return x; 
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
    
    protected int acelerar(int v) {
        this.velocidad += v;
        return this.velocidad;
    }
    
    protected int frenar(int v) {
        try {
            if ((this.velocidad - v) < 0) {
                throw new Exception("Si frenas tantos vas a tener una vel negativa");
            }
            this.velocidad -= v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this.velocidad;
    } 
    
    public String toStrint() {
        return "Matrícula: "+matricula+"\nMarcha: "+marcha+"\nVelocidad: ";
    }
    
    protected void cambiaMarcha(int marcha) {
        this.marcha = marcha;
    }
}
