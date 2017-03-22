package ejercicio520;

public class Cola extends ColeccionSimple{
    
    public Cola() {    
    }
    
    public void añadir(Object obj) {
       getLista().add((getLista().size()-1), obj);
    }
}