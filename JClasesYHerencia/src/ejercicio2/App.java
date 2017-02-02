
package ejercicio2;


public class App {
    
    public static void main(String[] args) {
        
        Punto[] vertices = {new Punto(0,0), new Punto(2,0), new Punto(2,2), new Punto(0,2)};
        Poligono cuadradoRojo = new Poligono(vertices);
        
        System.out.println(cuadradoRojo);
        System.out.println("Perímetro: "+cuadradoRojo.perimetro());
        cuadradoRojo.trasladar(4, -3);
        System.out.println("");
        System.out.println(cuadradoRojo);
    }
    
}
