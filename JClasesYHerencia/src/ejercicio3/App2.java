package ejercicio3;

public class App2 {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: ejercicio3.App2");
        
        ListaMultimedia miLista = new ListaMultimedia(10);
        
        for (int i=1; i<=3; i++) {
            miLista.add(Disco.inputMedia());
        }
        
        System.out.println("");
        System.out.print(miLista);
        
        System.out.println("\n");
                
        Multimedia disco = new Disco(miLista.get(1).getTitulo(), miLista.get(1).getAutor(), "4", 4, "4");
        miLista.add(disco);
        
        System.out.println("");
        System.out.print(miLista.get(miLista.indexOf(disco)));
        System.out.print("Índice: ");
        System.out.println(miLista.indexOf(disco));
    }
    
}