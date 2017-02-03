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
    protected void acelerar(int v) {
        this.velocidad += v;
        if (this.velocidad == 0) {
            this.marcha = 0;
        } else if (this.velocidad <= 10) {
            this.marcha = 1;
        } else if (this.velocidad <= 40) {
            this.marcha = 2;
        } else if (this.velocidad <= 60 ) {
            this.marcha = 3;
        } else if (this.velocidad <= 80) {
            this.marcha = 4;
        } else {
            this.marcha = 5;
        } 
    }
    
    @Override
    protected void frenar(int v) {
        try {
            if (this.velocidad - v < 0) {
                throw new Exception("Si frenas tantos vas a tener una vel negativa");
            }
            this.velocidad -= v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (this.velocidad == 0) {
            this.marcha = 0;
        } else if (this.velocidad <= 10) {
            this.marcha = 1;
        } else if (this.velocidad <= 40) {
            this.marcha = 2;
        } else if (this.velocidad <= 60 ) {
            this.marcha = 3;
        } else if (this.velocidad <= 80) {
            this.marcha = 4;
        } else if (this.velocidad <= 120) {
            this.marcha = 5;
        } else {
            this.marcha = 6;
        }
    }
}
