package ejercicio81;

public class PilaArray implements ColeccionSimple{

    
    public boolean estaVacia() {
        return ARRAY.isEmpty();
    }
    
    public Object extraer() {
        Object obj = ARRAY.get(0);
        ARRAY.remove(0);
        return obj;
    }
    
    public Object primero() {
        return ARRAY.get(0);
    }
    
    public boolean añadir(Object obj) {
        ARRAY.add(0, obj);
        return true;
    }
}
