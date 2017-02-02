package ejercicio3;

class Disco extends Multimedia {
    
    private final String genero;
    
    Disco (String titulo, String autor, String formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }
    
    String getGenero() {
        return genero;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nGenero: "+genero+"\n";
    }
    
    protected static Multimedia inputMedia() {
        Disco disco;
        boolean ctrl;
        do {
            System.out.println("");
            System.out.print("Introduzca título: ");
            String titulo = INPUT.nextLine();
            System.out.print("Introduzca autor: ");
            String director = INPUT.nextLine();
            System.out.print("Introduzca formato: ");
            String formato = INPUT.nextLine();
            System.out.print("Introduzca duración (en minutos): ");
            String duracion = INPUT.nextLine();
            System.out.print("Introduzca género: ");
            String genero = INPUT.nextLine();
           
            if (Multimedia.testDuracion(duracion)) {
                disco = new Disco(titulo, director, formato, Integer.parseInt(duracion), genero);
                ctrl = true;
            } else {
                disco = null;
                ctrl = false;
            }
        } while (!ctrl);
        
        return disco;
    }
}
