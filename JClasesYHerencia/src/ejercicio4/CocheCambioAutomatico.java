/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author mati
 */
public class CocheCambioAutomatico extends Coche{
    
    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }
    
    @Override
    public void acelerar(int v) {
        super.acelerar(v);
        if (velocidad == 0) {
            marcha = 0;
        } else if (velocidad <= 10) {
            marcha = 1;
        } else if (velocidad <= 40) {
            marcha = 2;
        } else if (velocidad <= 60 ) {
            marcha = 3;
        } else if (velocidad <= 80) {
            marcha = 4;
        } else {
            marcha = 5;
        } 
    }
    
    @Override
    public void frenar(int v) {
        super.frenar(v);
        if (velocidad == 0) {
            marcha = 0;
        } else if (velocidad <= 10) {
            marcha = 1;
        } else if (velocidad <= 40) {
            marcha = 2;
        } else if (velocidad <= 60 ) {
            marcha = 3;
        } else if (velocidad <= 80) {
            marcha = 4;
        } else if (velocidad <= 120) {
            marcha = 5;
        } else {
            marcha = 6;
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+"Tipo: Automático\n";
    }
}
