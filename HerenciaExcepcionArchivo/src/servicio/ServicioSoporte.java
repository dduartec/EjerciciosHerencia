/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Exception.CDException;
import Exception.DVDException;
import Exception.LibroException;
import Exception.PrestamoException;
import Exception.TituloException;
import dao.Dao;
import data.Soporte;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.ObjectOutputStream;

/**
 *
 * @author fabian.giraldo
 */
public class ServicioSoporte {
    private Dao dao;
    private ArrayList<Soporte> soportes=new ArrayList<>(); 
    private ArrayList<Usuario> usuarios=new ArrayList<>();
    public ServicioSoporte(){
      this.dao = new Dao();
     }
    
    public void cargarSoportes(String archivo) throws FileNotFoundException, LibroException,TituloException,DVDException,CDException{
       this.soportes = this.dao.cargarSoportes(archivo);
    }
    
    public ArrayList<Soporte> getSoportes(){
      return this.soportes;
    }
    
   public Soporte buscar(String titulo){
   for(Soporte soporte : this.soportes){
       if(soporte.getTitulo().equalsIgnoreCase(titulo))
           return soporte;
       
       
   }
   return null;
   }
   public void crearUsuario() throws PrestamoException{
       if(this.soportes==null){
           throw new PrestamoException("primero ingrese los soportes");
       }else{
            Scanner lectura = new Scanner(System.in);
            System.out.println("nombre del usuario");
            String nombre = lectura.next();
            System.out.println("apellido del usuario");
            String apellido = lectura.next();
            System.out.println("direccion del usuario");
            String direccion = lectura.next();
            int aux=0;
            for(int i=0;i<usuarios.size();i++){
                if(nombre.equals(usuarios.get(i).getNombre())){
                    if(apellido.equals(usuarios.get(i).getApellido())){
                        aux=1;
                    }
                }                 
            }
            if(aux==1){
                throw new PrestamoException("Ya hay un ususario registardo con los mismos nombres y apellidos");
            }else{
                usuarios.add(new Usuario(nombre,apellido,direccion,this.getSoportes()));
            }
            
       }
   }
   public void prestamo()throws PrestamoException{
       if(this.soportes==null){
           throw new PrestamoException("primero ingrese los soportes");
       }
       if(this.usuarios.isEmpty()){
           throw new PrestamoException("No hay ningun usuario registrado aun");
       }
       System.out.println(this.soportes.size());
       Scanner lectura = new Scanner(System.in);
       System.out.println("-----------LOG IN");
       System.out.println("nombre: ");
       String nombre = lectura.next();
       System.out.println("apellido: ");
       String apellido = lectura.next();
       int aux=0;
       for(int i=0;i<usuarios.size();i++){
           if(nombre.equals(usuarios.get(i).getNombre())){
                if(apellido.equals(usuarios.get(i).getApellido())){
                    usuarios.get(i).prestamo();
                    aux=1;
                }
            }                 
        }
       if(aux==0){
                throw new PrestamoException("No se ha encontrado el usuario");
            }
   }
   
   
   /*public ArrayList<Soporte> buscar (String titulo){
    for(Soporte soporte : this.soportes){
       if(soporte.getTitulo().equalsIgnoreCase(titulo))
           return soporte;
   }
   return null;
   }*/
}
