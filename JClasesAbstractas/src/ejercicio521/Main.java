package ejercicio521;

import ejercicio520.*;

public class Main {
    public static void rellenar(ColeccionSimple cs) {
        for (int i=1; i<=10; i++) {
            cs.añadir(i);
        }
    }
    
    public static void imprimirYVaciar(ColeccionSimple cs) {
        while (!cs.estaVacia()) {
            System.out.println(cs.extraer());
        }
    }
    
    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola();
        
        rellenar(pila);
        imprimirYVaciar(pila);
        
        rellenar(cola);
        imprimirYVaciar(cola);
        
        pila.añadir("once"); //string
        pila.añadir(12.00001); //double
        pila.añadir('t'); //char
        
        imprimirYVaciar(pila);
    }
}
