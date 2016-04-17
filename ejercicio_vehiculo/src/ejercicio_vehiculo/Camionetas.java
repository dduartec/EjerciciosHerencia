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
public class Camionetas extends Vehiculo{
    private double carga;
    private int ejes;
    private int rodadas;

    public Camionetas(double carga, int ejes, int rodadas, String numSerie, String marca, int año, double precio) {
        super(numSerie, marca, año, precio);
        this.carga = carga;
        this.ejes = ejes;
        this.rodadas = rodadas;
    }

    @Override
    public String toString() {
        return "Camionetas{" + "numSerie=" + numSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio + ", carga=" + carga + " Kgs, ejes=" + ejes + ", rodadas=" + rodadas + '}';
    }
    
    
    
}
