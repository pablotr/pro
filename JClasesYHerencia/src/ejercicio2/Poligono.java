package ejercicio2;

public class Poligono {
    
    Punto[] puntos;
    
    public Poligono(Punto[] puntos) {
        this.puntos = puntos;
    }
    
    public void trasladar(int x, int y) {
        for (int i=0; i<puntos.length; i++) {
            puntos[i].setX(puntos[i].getX()+x);
            puntos[i].setY(puntos[i].getY()+y);
        }
    }
    
    public void escalar(int x, int y) {
        for (int i=0; i<puntos.length; i++) {
            puntos[i].setX(puntos[i].getX()*x);
            puntos[i].setY(puntos[i].getY()*y);
        }
    }
    
    public int numVertices() {
        return puntos.length;
    }
    
    public double perimetro() {
        double peri = 0;
        for (int i=1; i<puntos.length; i++) {
            peri += puntos[i].distancia(puntos[i-1]);
        }
        peri += puntos[0].distancia(puntos[puntos.length-1]);
        return peri;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int i=0; i<puntos.length; i++) {
            str = str.concat("Vértice["+(i+1)+"]: ("+puntos[i].getX()+","+puntos[i].getY()+")\n");
        }
        return str;
    }
}
