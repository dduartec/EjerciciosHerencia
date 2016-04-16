/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cuentasbancarias;
import java.util.Calendar;
/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Ejercicio_CuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        String mes = Integer.toString(c1.get(Calendar.MONTH));
        Ahorros ahorros=new Ahorros("22/1/2018",70000,1234,"Andres Rodriguez",1000000);//La fecha debe ser ingesada en formato dia/mes/año
        Cheque cheque = new Cheque(1000,10000,1202,"Juan Martinez",6000000);
        ahorros.retirar(100000);
        ahorros.Depositar(50000);
        ahorros.depositarIntereses();
        ahorros.consultarDatos();
        cheque.Depositar(100000);
        cheque.retirar(7000000);
        cheque.consultarDatos();
    }
    
}
