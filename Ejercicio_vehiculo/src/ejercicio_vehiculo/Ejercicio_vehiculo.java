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
public class Ejercicio_vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compacto compacto=new Compacto("0001","Mazda",2016,12000000,4);
        Lujo lujo =new Lujo("0002","Audi",2014,100000000,2);
        Vagoneta vagoneta=new Vagoneta("0003","Nissan",2010,50000000,8);
        Camioneta camioneta=new Camioneta("0004","Renault",2006,20000000,1000,4,2);
        System.out.println(compacto.toString());
        System.out.println(lujo.toString());
        System.out.println(vagoneta.toString());
        System.out.println(camioneta.toString());
    }
    
}
