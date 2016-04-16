/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_vehiculo;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Lujo extends Vehiculo {

    public Lujo(String NumeroSerie, String marca, int año, double precio,int pasajeros) {
        super(NumeroSerie, marca, año, precio);
        this.pasajeros=pasajeros;
    }
    @Override
   public String toString() {
        return "Auto de Lujo{" + "NumeroSerie=" + NumeroSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio + ",pasajeros="+pasajeros+'}';
    }
    
}
