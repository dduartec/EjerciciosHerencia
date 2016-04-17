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
public class Cuenta {
    protected int numCuenta;
    protected String nombreCliente;
    protected double saldo;

    public Cuenta(int numCuenta, String nombreCliente, double saldo) {
        this.numCuenta = numCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
    public void consultarDatos(){
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("Nombre del cliente: "+nombreCliente);
        System.out.println("Saldo: "+saldo);
    }
    public void depositar(double deposito){
        saldo=deposito+saldo;
        System.out.println("deposito realizado con exito. Nuevo saldo: "+saldo);
    }
    public void retirar (double retiro){
        if(saldo<retiro){
            System.out.println("no posee fondos suficientes");
            
        }else{
            saldo=saldo-retiro;
            System.out.println("retiro realizado con exito. Nuevo saldo: "+saldo);
                        
        } 
    }
}
