package ejercicio6;

public class App {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: JClasesYHerencia.ejercicio6.App\n");
        
        Vehiculo[] listaV = new Vehiculo[4];
        
        Coche coche1 = new Coche("BNV423-A", 4);
        Coche coche2 = new Coche("AHB741-B", 2);
        Camion camion1 = new Camion("45BCW1-C");
        Camion camion2 = new Camion("97GGW7-D");
        
        for (int i=0; i<listaV.length; i++) {
            switch (i){
                case 0:
                    listaV[i] = coche1;
                    break;
                case 1:
                    listaV[i] = coche2;
                    break;
                case 2:
                    listaV[i] = camion1;
                    break;
                case 3:
                    listaV[i] = camion2;
                    break;
            }
        }
        
        for (int i=0; i<listaV.length; i++) {
            if (listaV[i] instanceof Camion) {
                ((Camion)listaV[i]).ponRemolque(new Remolque(5000));
            }
            listaV[i].acelerar(120);
            System.out.println(listaV[i]);
        }
    }
}
