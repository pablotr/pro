package ejercicio3;

public class App2 {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JClasesYHerencia.ejercicio3.App2\n");
        
        ListaMultimedia miLista = new ListaMultimedia(10);
        
        for (int i=1; i<=3; i++) {
            miLista.add(Disco.inputMedia());
            if (i < 3) {
                System.out.println("");
            }
        }
        
        System.out.print("\n" + miLista);
                
        Multimedia disco = new Disco(miLista.get(1).getTitulo(), miLista.get(1).getAutor(), "4", 4, "4");
        miLista.add(disco);
        
        System.out.print("\n" + miLista.get(miLista.indexOf(disco)));
        System.out.print("Índice: ");
        System.out.println(miLista.indexOf(disco));
    }
    
}