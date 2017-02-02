package ejercicio3;

public class App {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: ejercicio3.App");

        ListaMultimedia miLista = new ListaMultimedia(10);
        
        for (int i=1; i<=3; i++) {
            miLista.add(Pelicula.inputMedia());
        }
        
        System.out.println("");
        System.out.print(miLista);
        
        System.out.println("\n");
        System.out.println("Cree un objeto de tipo Película introduciendo el título "
                + "y el autor de una de las películas de la lista. Para el resto "
                + "de los argumentos se utilizan valores no significativos.");
        
        Multimedia peli = Pelicula.inputMedia();
        miLista.add(peli);
        
        System.out.println("");
        System.out.print(miLista.get(miLista.indexOf(peli)));
        System.out.print("Índice: ");
        System.out.println(miLista.indexOf(peli));
    }
    
}

