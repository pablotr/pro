package ejercicio520;

public class Pila extends ColeccionSimple{
    
    public Pila() {    
    }
    
    public void añadir(Object obj) {
       getLista().add(0, obj);
    }
}
