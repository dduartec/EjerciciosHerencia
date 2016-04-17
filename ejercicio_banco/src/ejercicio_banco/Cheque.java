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
public class Cheque extends Cuenta {
    private double comUso;
    private double comEmision;

    public Cheque(double comUso, double comEmision, int numCuenta, String nombreCliente, double saldo) {
        super(numCuenta, nombreCliente, saldo);
        this.comUso = comUso;
        this.comEmision = comEmision;
    }

    @Override
    public void retirar(double retiro) {
        if(saldo<retiro){
            System.out.println("no posee fondos sificientes. Se le recargara el valor por emision de cheques con saldo insuficiente a su saldo");
            saldo=saldo-comEmision;
        }else{            
            super.retirar(retiro);
            saldo=saldo-comUso;
            System.out.println("se cargó la comision por uso");
        }
    }

    @Override
    public void depositar(double deposito) { 
        saldo=saldo-comUso;
        System.out.println("se cargó la comision por uso");
        super.depositar(deposito); 
        
    }
    
    
    
}
