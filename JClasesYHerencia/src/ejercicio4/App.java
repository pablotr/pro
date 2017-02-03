package ejercicio4;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        System.out.println("RUNNING: ejericio4.App");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("----CREAR COCHE----");
        System.out.print("Introduzca la matrícula: ");
        String matricula = input.nextLine();
        System.out.println("Seleccione el tipo (introduzca el número): ");
        System.out.println("1 - Manual");
        System.out.println("2 - Automático");
        System.out.print("--> ");
        String resp = input.nextLine();
        boolean ctrl;       
        switch (resp) { 
            case "1":
                Coche manual = new CocheCambioManual(matricula);
                System.out.println(manual);
                manual.acelerar(60);
                manual.cambiarMarcha(3);
                System.out.println(manual);
                ctrl = true;
                break;
            case "2":
                Coche auto = new CocheCambioAutomatico(matricula);
                System.out.println(auto);
                auto.acelerar(60);
                System.out.println(auto);
                ctrl = true;
                break;
            default:
                System.out.println("Introduzca un valor válido");
                ctrl = false;
                break;
        };
    }
}
