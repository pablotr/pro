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
            validarMarcha(marcha);
            this.marcha = marcha;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+"Tipo: Manual\n";
    }
    
    private static void validarMarcha(int marcha) throws Exception {
        if (marcha < 0) {
            throw new Exception("La marcha atrás no está permitada: no puedes "
                    + "poner una marcha negativa");
        }
    }
}
