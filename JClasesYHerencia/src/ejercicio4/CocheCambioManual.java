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
public class CocheCambioManual extends Coche {
    
    public CocheCambioManual (String matricula) {
        super(matricula);
    }
    
    @Override
    public void cambiarMarcha (int marcha) {
        try {
            if (marcha < 0) {
                throw new Exception("marcha atras prohibida");
            }
            this.marcha = marcha;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+"Tipo: Manual\n";
    }
}
