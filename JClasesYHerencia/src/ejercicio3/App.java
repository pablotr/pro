package ejercicio3;

public class App {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JClasesYHerencia.ejercicio3.App\n");

        ListaMultimedia miLista = new ListaMultimedia(10);
        
        for (int i=1; i<=3; i++) {
            miLista.add(Pelicula.inputMedia());
            if (i < 3) {
                System.out.println("");
            }
        }
        
        System.out.print("\n" + miLista);
                
        Multimedia peli = new Pelicula(miLista.get(1).getTitulo(), miLista.get(1).getAutor(), "4", 4, "4", "4");
        miLista.add(peli);
        
        System.out.print("\n" + miLista.get(miLista.indexOf(peli)));
        System.out.print("Índice: ");
        System.out.println(miLista.indexOf(peli));
    }
    
}

