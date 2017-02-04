package ejercicio1;

public class App {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JClasesYHerencia.ejercicio1.App\n");
        
        Fecha hoy = new Fecha(30, 1, 2017);
        Hora actual = new Hora(8, 30);
        Examen matematicas = new Examen("Matematicas", "A2", hoy, actual);
        
        System.out.println(matematicas);
        
        hoy.setDia(4);
        hoy.setMes(2);
        
        actual.setHora(10);
        actual.setMinuto(45);
        
        System.out.println("");
        System.out.println(matematicas);
    }
    
}
