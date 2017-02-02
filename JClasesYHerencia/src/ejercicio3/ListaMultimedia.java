package ejercicio3;

class ListaMultimedia {
    private final Multimedia[] media;
    private int totalMedia;

    ListaMultimedia(int maximo) {
        media = new Multimedia[maximo];
        totalMedia = 0;
    }
    
    int size() {
        return totalMedia;
    }
   
    boolean add(Multimedia m) {
        boolean x;
        if (totalMedia < media.length) {
            media[totalMedia] = m;
            totalMedia ++;
            x = true;
        } else {
            x = false;
        }
        return x;
    }
    
    Multimedia get(int posicion){
        
        return media[posicion];
    }
    
    int indexOf(Multimedia m) {
        int index = 0;
        for (int i=0; i<totalMedia; i++) {
            if (media[i] == m) {
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    @Override
    public String toString() {
        String str="";
        for (int i=0; i<totalMedia; i++) {
            str = str.concat("\n"+media[i]);
        }
        return str;
    }
    
}
