/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Exception.PrestamoException;
import data.Soporte;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private ArrayList<Soporte> soportes=new ArrayList<>();
    private int prestamos;

    public Usuario(String nombre, String apellido, String direccion, ArrayList<Soporte> soportes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.soportes = soportes;
        this.prestamos=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void prestamo()throws PrestamoException{
        if(prestamos==3){
            throw new PrestamoException("No se pueden prestar mas de 3 productos");
        }
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el titulo");
        String titulo = lectura.next();
        int aux=0;
        for(Soporte soporte : this.soportes){
            if(soporte.getTitulo().equalsIgnoreCase(titulo)){
                if(soporte.getEstado()==true){
                    throw new PrestamoException("El producto ya ha sido prestado");
                }else{      
                    this.prestamos++;
                    soporte.setEstado(true);
                    aux=1;
                }                
            }
        }
        if(aux==0){
            throw new PrestamoException("el producto no existe");
        }else{
            System.out.println("prestamo realizado con exito. Numero de prestamos: "+prestamos);
        }
    }
}
