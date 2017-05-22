package programaciongrafica;

import javax.swing.*;

public class OptionPane {
    
    public static void main(String[] args) throws Exception {
        
        int opcion;
        String[] menu = {"Opción 1","Opción 2","Mensaje Simple","Otro Menú"
                ,"HTML","PideCadena","PideEntero","Salir"};
        
        do {
            opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Ejemplos con JOptionPane"
                    , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            
            switch(opcion) {
                case 0:
                    System.out.println("Seleccionó la Opción 1");
                    break;
                case 1:
                    System.out.println("Seleccionó la Opción 2");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Hola Mundo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    int opcion2;
                    do {
                        opcion2 = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Ejemplos con JOptionPane - Otro Menú"
                            , JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null
                            , new String[] {"Opción 1","Opción 2","Salir"}, menu[0]);
                        if (opcion2 == 0) {
                            System.out.println("Otro Menú: Seleccionó la Opción 1");
                        } else if (opcion2 == 1) {
                            System.out.println("Otro Menú: Seleccionó la Opción 2");
                        } else {
                            opcion2 = -1;
                        }
                    } while(opcion2 != -1);
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        } while(opcion != -1);
    }
    
    
}
