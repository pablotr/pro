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
                    String html = ""
                            + "<html>"
                            + "<head>"
                                + "<style>"
                                + "table, th, td {border: 1px ridge black; border-collapse: collapse;}"
                                + "</style>"
                            + "</head>"
                            + "<body>"
                                + "<p style=\"text-align:center;\">Mensaje Centrado</p>"
                                + "<table>"
                                    + "<tr>"
                                        + "<th>Uno</th><th>Dos</th><th>Tres</th>"
                                    + "</tr>"
                                    + "<tr>"
                                        + "<td>celda1</td><td>celda2</td><td>celda3</td>"
                                    + "</tr>"
                                + "</table>"
                            + "</body>"
                            + "</html>";
                    JOptionPane.showMessageDialog(null, html, "HTML: Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    String strInput = (String) JOptionPane.showInputDialog(null, "Escribe algo", "Entrada", JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (strInput != null) {
                        JOptionPane.showMessageDialog(null, "Cadena: "+strInput, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 6:
                    int intInput = 0;
                    strInput = (String) JOptionPane.showInputDialog(null, "Escribe un entero", "Entrada", JOptionPane.QUESTION_MESSAGE, null, null, null);
                    boolean ctrl = false;
                    try {
                        if (strInput != null) {
                            intInput = Integer.parseInt(strInput);
                            ctrl = true;
                        }     
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Introduzca un número entero, usando sólo carácteres numéricos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if (ctrl) {
                        JOptionPane.showMessageDialog(null, "Número: "+intInput, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 7:
                    opcion = -1;
                    break;
            }
        } while(opcion != -1);
    }
    
    
}
