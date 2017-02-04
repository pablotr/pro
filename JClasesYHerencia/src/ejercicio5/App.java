package ejercicio5;

import ejercicio3.*;

public class App {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JClasesYHerencia.ejercicio5.App\n");
        
        ListaMultimedia miLista = new ListaMultimedia(10);
        
        for (int i=1;i<=3;i++) {
//            miLista.add(Disco.inputMedia());
            if (i%2!=0) {
                miLista.add(new Disco(Integer.toString(i), Integer.toString(i), Integer.toString(i), i, "rock"));
            } else {
                miLista.add(new Disco(Integer.toString(i), Integer.toString(i), Integer.toString(i), i, "jazz"));
            }
        }
        for (int i=1;i<=3;i++) {
//            miLista.add(Pelicula.inputMedia());
            if (i==1) {
                miLista.add(new Pelicula(Integer.toString(i), Integer.toString(i), Integer.toString(i), i, Integer.toString(i), ""));
            } else {
                miLista.add(new Pelicula(Integer.toString(i), Integer.toString(i), Integer.toString(i), i, Integer.toString(i), Integer.toString(i)));
            }
        }
        
        System.out.println(miLista);
        
        System.out.println("Duración total: " + miLista.duracionTotal());

        System.out.println("Nº de discos de rock: " + miLista.totalAtributosMismoValor("Disco", "genero", "rock"));

        System.out.println("Nº de películas sin actriz principal: " + miLista.totalAtributosMismoValor("Pelicula", "mainActriz", ""));
    }
}
