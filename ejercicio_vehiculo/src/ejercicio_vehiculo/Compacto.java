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
public class Compacto extends Vehiculo {

    public Compacto(String numSerie, String marca, int año, double precio,int numPasajeros) {
        super(numSerie, marca, año, precio);
        this.numPasajeros=numPasajeros;
    }

    @Override
    public String toString() {
        return "Compacto{" + "numSerie=" + numSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio + ", numPasajeros=" + numPasajeros + '}';
    }
    
    
}
