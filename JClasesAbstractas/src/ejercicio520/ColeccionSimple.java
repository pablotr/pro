package ejercicio520;

import java.util.ArrayList;

public abstract class ColeccionSimple {

    private ArrayList<Object> lista;
    
    public ColeccionSimple() {
        lista = new ArrayList<>();
    }
    
    public boolean estaVacia() {
        return lista.isEmpty();
    }
    
    public Object extraer() {
        Object obj = lista.get(0);
        lista.remove(0);
        return obj;
    }
    
    public Object primero() {
        return lista.get(0);
    }
    
    public abstract void añadir(Object obj);
    
    public String toString() {
        return lista.toString();
    }
    
    protected ArrayList<Object> getLista() {
        return lista;
    }
}
