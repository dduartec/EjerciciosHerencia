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
public class Vehiculo {
    protected String numSerie;
    protected String marca;
    protected int año;
    protected double precio;
    protected int numPasajeros;

    public Vehiculo(String numSerie, String marca, int año, double precio) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    @Override
    public  String toString() {
        return "Vehiculo{" + "numSerie=" + numSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
