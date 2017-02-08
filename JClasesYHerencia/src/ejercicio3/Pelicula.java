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
    
    private static void validarActores(String actor, String actriz) throws Exception {
        if (actor.isEmpty() && actriz.isEmpty()) {
            throw new Exception("Debe registrarse por lo menos un actor principal o una actriz principal");
        } 
    }
        
    
    
    public static Multimedia inputMedia() {
        Pelicula peli = null;
        boolean ctrl = false;
        do {
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
            
            try {
                validarActores(actor, actriz);
                peli = new Pelicula(titulo, director, formato, Integer.parseInt(duracion), actor, actriz);
                ctrl = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (!ctrl);
        
        return peli;
    }
    
    
}
