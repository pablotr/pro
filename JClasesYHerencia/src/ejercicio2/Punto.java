package ejercicio2;

public class Punto {
    
    private int x;
    private int y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public double distancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.x-x, 2)+Math.pow(otro.y-y, 2));
    }
    
    public String toString() {
        return "("+x+","+y+")";
    }
}
