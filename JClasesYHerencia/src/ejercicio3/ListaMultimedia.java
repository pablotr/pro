package ejercicio3;

public class ListaMultimedia {
    private final Multimedia[] lista;
    private int totalMedia;

    public ListaMultimedia(int maximo) {
        lista = new Multimedia[maximo];
        totalMedia = 0;
    }
    
    public int size() {
        return totalMedia;
    }
   
    public boolean add(Multimedia m) {
        boolean x;
        if (totalMedia < lista.length) {
            lista[totalMedia] = m;
            totalMedia ++;
            x = true;
        } else {
            x = false;
        }
        return x;
    }
    
    public Multimedia get(int posicion){
        
        return lista[posicion];
    }
    
    public int indexOf(Multimedia m) {
        int index = 0;
        for (int i=0; i<totalMedia; i++) {
            if (lista[i] == m) {
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
            str = str.concat("\n"+lista[i]);
        }
        return str;
    }
    
    public int duracionTotal() {
        int min = 0;
        for (int i=0;i<totalMedia;i++) {
            min += lista[i].getDuracion();
        }
        return min;
    }
    
    public int totalAtributosMismoValor(String media, String atr, String valorAtr) {
        int total = 0;
        try {    
            if (Class.forName("ejercicio3."+media) == Disco.class) {
                for (int i=0;i<totalMedia;i++) {
                    if (lista[i] instanceof Disco) {
                        switch (atr) {
                            case "titulo":
                                if (lista[i].getTitulo().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            case "autor":
                                if (lista[i].getAutor().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            case "formato":
                                if (lista[i].getFormato().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            case "duracion":
                                if (lista[i].getDuracion() == (Integer.valueOf(valorAtr))) {
                                    total++;
                                }
                                break;
                            case "genero":
                                if (((Disco)lista[i]).getGenero().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            default:
                                System.out.println("ERROR: No existe el Atributo (atr) introducido");
                                break;
                        }
                    }
                }
            } else if (Class.forName("ejercicio3."+media) == Pelicula.class) {
                for (int i=0;i<totalMedia;i++) {
                    if (lista[i] instanceof Pelicula) {
                        switch (atr) {
                            case "titulo":
                                if (lista[i].getTitulo().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            case "autor":
                                if (lista[i].getAutor().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            case "formato":
                                if (lista[i].getFormato().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            case "duracion":
                                if (lista[i].getDuracion() == (Integer.valueOf(valorAtr))) {
                                    total++;
                                }
                                break;
                            case "mainActor":
                                if (((Pelicula)lista[i]).getMainActor().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            case "mainActriz":
                                if (((Pelicula)lista[i]).getMainActriz().equals(valorAtr)) {
                                    total++;
                                }
                                break;
                            default:
                                System.out.println("ERROR: No existe el Atributo (atr) introducido");
                                break;
                        }
                    }
                }
            } else if (Class.forName("ejercicio3."+media) == Multimedia.class) {
                for (int i=0;i<totalMedia;i++) {
                    switch (atr) {
                        case "titulo":
                            if (lista[i].getTitulo().equals(valorAtr)) {
                                total++;
                            }
                            break;
                        case "autor":
                            if (lista[i].getAutor().equals(valorAtr)) {
                                total++;
                            }
                            break;
                        case "formato":
                            if (lista[i].getFormato().equals(valorAtr)) {
                                total++;
                            }
                            break;
                        case "duracion":
                            if (lista[i].getDuracion() == (Integer.valueOf(valorAtr))) {
                                total++;
                            }
                            break;
                        default:
                            System.out.println("ERROR: No existe el Atributo (atr) introducido");
                            break;
                    }
                }
            }
        } catch (ClassNotFoundException a) {
            System.out.println("ERROR: No existe la Clase (media) introducida");
        } catch (Exception b) {
            System.out.println("ERROR");
        }
        return total;
    }
}
