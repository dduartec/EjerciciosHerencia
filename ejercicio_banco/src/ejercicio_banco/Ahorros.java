/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_banco;
import java.util.Calendar;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Ahorros extends Cuenta {
    private String fechaVencimiento;
    private double interesMensual;

    public Ahorros(String fechaVencimiento, double interesMensual, int numCuenta, String nombreCliente, double saldo) {
        super(numCuenta, nombreCliente, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.interesMensual = interesMensual;
    }
    public void depositarIntereses(){
        Calendar fecha= Calendar.getInstance();
        int dia=fecha.get(Calendar.DATE);
        if(dia==1){
            saldo=saldo-((saldo*interesMensual)/100);
            System.out.println("se recargó el interes mensual. Nuevo saldo: "+saldo);
            
        }else{
            System.out.println("solo se puede cargar el interes mensual el primer dia de cada mes");
        }        
    }

    @Override
    public void retirar(double retiro) {
        Calendar f=Calendar.getInstance();
        String dia = Integer.toString(f.get(Calendar.DATE));
        String mes = Integer.toString(f.get(Calendar.MONTH)+1);
        String año = Integer.toString(f.get(Calendar.YEAR));
        String fecha=dia+"/"+mes+"/"+año;
        //String fecha="22/1/2018";
        if(fecha.equals(fechaVencimiento)){
            super.retirar(retiro);         
        }else{
            System.out.println("solo se puede retirar en la fecha de vencimiento: "+fechaVencimiento);
        }         
    }
    
    
    
    
}
