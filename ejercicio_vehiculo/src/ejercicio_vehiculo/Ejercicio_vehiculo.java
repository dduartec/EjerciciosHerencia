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
        Compacto compacto =new Compacto("0000","Renault",2015,20000000,4);
        Lujo lujo =new Lujo("0001","Ferrari",2017,200000000,2);
        Vagonetas vagoneta =new Vagonetas("0002","Nissan",2012,15000000,8);
        Camionetas camioneta=new Camionetas(2000.5,8,4,"0003","Chevrolette",2003,10000000);
        System.out.println(compacto.toString());
        System.out.println(lujo.toString());
        System.out.println(vagoneta.toString());
        System.out.println(camioneta.toString());
    }
    
}
