package ejercicio3;

public class Pelicula extends Multimedia {
    
    private final String mainActor;
    private final String mainActriz;
    
    public Pelicula(String titulo, String autor, String formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        mainActor = actor;
        mainActriz = actriz;
    }
    
    public String getMainActor() {
        return mainActor;
    }
    
    public String getMainActriz() {
        return mainActriz;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Actor principal: "+mainActor+"\nActriz principal: "+mainActriz+"\n";
    }
    
    private static boolean testActores(String actor, String actriz) {
        boolean x;
        try {
            if (actor.isEmpty() && actriz.isEmpty()) {
                throw new Exception("Debe registrarse por lo menos un actor principal o una actriz principal");
            }
            x = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            x = false;
        } 
        return x;
    }
    
    
    public static Multimedia inputMedia() {
        Pelicula peli;
        boolean ctrl;
        do {
            System.out.println("");
            System.out.print("Introduzca título: ");
            String titulo = INPUT.nextLine();
            System.out.print("Introduzca director: ");
            String director = INPUT.nextLine();
            System.out.print("Introduzca formato: ");
            String formato = INPUT.nextLine();
            System.out.print("Introduzca duración (en minutos): ");
            String duracion = INPUT.nextLine();
            System.out.print("Introduzca actor principal: ");
            String actor = INPUT.nextLine();
            System.out.print("Introduzca actriz principal: ");
            String actriz = INPUT.nextLine();
           
            if (Multimedia.testDuracion(duracion) && Pelicula.testActores(actor, actriz)) {
                peli = new Pelicula(titulo, director, formato, Integer.parseInt(duracion), actor, actriz);
                ctrl = true;
            } else {
                peli = null;
                ctrl = false;
            }
        } while (!ctrl);
        
        return peli;
    }
    
    
}
