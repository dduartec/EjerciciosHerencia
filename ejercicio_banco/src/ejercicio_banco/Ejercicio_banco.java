/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_banco;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Ejercicio_banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ahorros ahorro=new Ahorros("22/1/2018",3,1234,"Julian Quintero",5000);
        ahorro.consultarDatos();
        ahorro.depositarIntereses();
        ahorro.retirar(10);
        Cheque cheque = new Cheque(1,10,1202,"Adriana Restrepo",20000);
        cheque.consultarDatos();
        cheque.retirar(20000);
        cheque.depositar(500);
    }
    
}
