package ejercicio1;

public class Hora {
    
    private int hora;
    private int minuto;
    
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    @Override
    public String toString() {
        return hora+":"+minuto;
    }
}
