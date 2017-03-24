package ejercicio81;

import java.util.ArrayList;

interface ColeccionSimple {
    ArrayList<Object> ARRAY = new ArrayList<>();
    
    boolean estaVacia();
    Object extraer();
    Object primero();
    boolean añadir(Object obj);
}
