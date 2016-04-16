/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cuentasbancarias;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Cuenta {
    protected int NumeroCuenta;
    protected String NombreCliente;
    protected double saldo;

    public Cuenta(int NumeroCuenta, String NombreCliente, double saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.NombreCliente = NombreCliente;
        this.saldo = saldo;
    }
    
    public void consultarDatos(){
        System.out.println("Numero de Cuenta: "+this.NumeroCuenta);
        System.out.println("Nombre del cliente: "+this.NombreCliente);
        System.out.println("Saldo: "+this.saldo);
    }
    public void Depositar(int deposito){
        this.saldo=this.saldo+deposito;
        System.out.println("Deposito realizado con exito. Nuevo saldo: "+this.saldo);
    }
    public void retirar(double retiro){
        if(this.saldo<retiro){
            System.out.println("fondos insufiscientes");                    
        }else{    
            this.saldo=this.saldo-retiro;
            System.out.println("retiro realizado con exito. Nuevo saldo: "+this.saldo);        
        }
    }
}
