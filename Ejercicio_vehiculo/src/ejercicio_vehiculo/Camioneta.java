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
public class Camioneta extends Vehiculo{

    private double carga;
    private int ejes;
    private int rodadas;
    public Camioneta(String NumeroSerie, String marca, int año, double precio,double carga,int ejes,int rodadas) {
        super(NumeroSerie, marca, año, precio);
        this.ejes=ejes;
        this.carga=carga;
        this.rodadas=rodadas;
    }
    @Override
   public String toString() {
        return "Camioneta{" + "NumeroSerie=" + NumeroSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio  + ",carga=" + carga + "Kg, ejes=" + ejes + ", rodadas=" + rodadas +'}';
    }

    
}
