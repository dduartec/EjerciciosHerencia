package ejercicio_cuentasbancarias;
import java.util.Calendar;
/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Ahorros extends Cuenta{
    private String FechaVencimiento;
    private double interesMensual;    

    public Ahorros(String FechaVencimiento, double interesMensual, int NumeroCuenta, String NombreCliente, double saldo) {
        super(NumeroCuenta, NombreCliente, saldo);
        this.FechaVencimiento = FechaVencimiento;
        this.interesMensual = interesMensual;
    }
    
    public void depositarIntereses(){
        Calendar fecha = Calendar.getInstance();
        //int dia=fecha.get(Calendar.DATE);
        int dia=1;
        if(dia==1){
            this.saldo=this.saldo-this.interesMensual;
            System.out.println("Se ha recargado el interes mensual. Nuevo saldo: "+this.saldo);
        }else{
            System.out.println("Aun no se pueden recagar los intereses. Soo es posible hacerlo el primer dia de cada mes");
        }
    }

    @Override
    public void retirar(double retiro) {
        Calendar c = Calendar.getInstance();
            String dia = Integer.toString(c.get(Calendar.DATE));
            String mes = Integer.toString(c.get(Calendar.MONTH));
            String año = Integer.toString(c.get(Calendar.YEAR));
        String fecha=dia+"/"+mes+"/"+año;//con la fecha actual
        //String fecha="22/1/2018";
        if(fecha!=this.FechaVencimiento){
            System.out.println("Solo puede retirar dinero el dia de la fecha de vencimiento("+this.FechaVencimiento+")");
        }else {
            super.retirar(retiro);
        }
    }
    
}
