
package ejercicio2;


public class App {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JClasesYHerencia.ejercicio2.App\n");
        
        Poligono cuadradoRojo = new Poligono(new Punto[]{new Punto(0,0), new Punto(2,0), new Punto(2,2), new Punto(0,2)});
        
        System.out.println(cuadradoRojo);
        System.out.println("Perímetro: "+cuadradoRojo.perimetro());
        cuadradoRojo.trasladar(4, -3);
        System.out.println("\n" + cuadradoRojo);
    }
    
}
