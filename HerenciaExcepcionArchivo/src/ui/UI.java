
package ui;

import Exception.CDException;
import Exception.DVDException;
import Exception.LibroException;
import Exception.PrestamoException;
import Exception.TituloException;
import data.Soporte;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicio.ServicioSoporte;
import java.util.InputMismatchException;

/**
 *
 * @author fabian.giraldo
 */
public class UI {
    private Scanner sc ;
    private ServicioSoporte servicio;
    private String ruta;

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
    
    
    
    public UI(){
      this.sc = new Scanner(System.in);
      this.servicio = new ServicioSoporte();
    }
         
    public void imprimirSoportes(ArrayList<Soporte> soportes){
        if(soportes != null){
          for(Soporte soporte: soportes){
              System.out.println(soporte);
          }
        }else{
            System.out.println("No existen soportes actualmente");
        }
   }
    
    public void menu() throws PrestamoException, LibroException, TituloException, CDException, DVDException,InputMismatchException{
        int opcion = 0;     
        System.out.println("Bienvenido a la mediateca");
        System.out.println("Opciones. 1.  Cargar datos   2. Imprimir.   3.Buscar.   4.Crear usuario.   5.Prestamo.   6.Salir"   );            
        try{
            opcion = this.sc.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("debe ingrear un numero");
            sc.next();
        }
        if(opcion == 1){
           System.out.println("Nombre del archivo: ");
           String rutaArchivo =   sc.next();
           this.ruta=rutaArchivo;
            try {
                this.servicio.cargarSoportes(rutaArchivo);
            } catch (FileNotFoundException ex) {
                System.out.println("El archivo especificado no existe");
            } catch (LibroException ex) {
                System.out.println(ex.getMessage());
            } catch (TituloException ex) {
                System.out.println(ex.getMessage());
            } catch (DVDException ex) {
                System.out.println(ex.getMessage());
            } catch (CDException ex) {
                System.out.println(ex.getMessage());
            }               
            
        }
        else if(opcion == 2){
           ArrayList<Soporte> soportes = this.servicio.getSoportes();
           this.imprimirSoportes(soportes);
        }
        else if(opcion == 3){
            Scanner lectura = new Scanner(System.in);
            System.out.println("Ingrese el titulo");
            String titulo = lectura.next();
            Soporte soporte = this.servicio.buscar(titulo);
        if(soporte != null) System.out.println(soporte);
        else{
            System.out.println("No existe");
        }
        }
        else if(opcion==4){
            try{
                this.servicio.crearUsuario();
            } catch(PrestamoException ex){
                System.out.println(ex.getMessage());
            }
            
        }else if(opcion==5){
            try{
                this.servicio.prestamo();
            }catch(PrestamoException ex){
                System.out.println(ex.getMessage());
            }
        }else if(opcion==6){
            System.exit(0);
        }else{
            System.out.println("Opcion invalida");
        }
    
    }
   
}
