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
public class Cheque extends Cuenta{
    private double ComisionUso;
    private double ComisionEmision;

    public Cheque(double ComisionUso, double ComisionEmision, int NumeroCuenta, String NombreCliente, double saldo) {        
        super(NumeroCuenta, NombreCliente, saldo);
        this.ComisionUso = ComisionUso;
        this.ComisionEmision = ComisionEmision;
    }

    @Override
    public void Depositar(int deposito) {
        this.saldo=this.saldo+deposito-this.ComisionUso;
        System.out.println("Deposito realizado con exito. Nuevo Saldo: "+this.saldo);
    }
    

    @Override
    public void retirar(double retiro) {
        if(this.saldo<retiro){
            System.out.println("saldo insuficiente, se le descontara el valor por comision de cheques con saldo insuficiente directamente de su saldo");
            this.saldo=this.saldo-this.ComisionEmision;
        }else{       
            this.saldo=this.saldo-retiro-this.ComisionUso;
            System.out.println("Retiro realizado con exito. Nuevo saldo: "+this.saldo);
        }
    }
    
    
}
