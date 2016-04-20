/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Exception.CDException;
import Exception.DVDException;
import Exception.LibroException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import data.Autor;
import data.Libro;
import data.Soporte;
import data.DVD;
import data.CD;
import Exception.TituloException;
import servicio.ServicioSoporte;

/**
 * @author fabian.giraldo
 * Luego va ser mejorada
 */
public class Dao {
    private ArrayList<String> titulos=new ArrayList<>();

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }
    
    
    public Autor cargarAutor(Scanner sc) {
	Autor autor = null;
	String nombre = sc.next().trim();
        String apellido = sc.next().trim();
        autor = new Autor(nombre, apellido);
        return autor;
    }
        
    public Libro cargarLibro(Scanner sc) throws LibroException, TituloException{
        ArrayList<String> titulos=new ArrayList<String>();
	Libro libro = null;
	String titulo= sc.next().trim();        
        if(titulo.length()> 100){
           throw new TituloException("Titulo incorrecto: "+titulo+". No puede ser mayor a 100 caracteres, este tiene "+titulo.length()+" caracteres" );
        }
        this.titulos.add(titulo);
        for(int i=0;i<this.titulos.size()-1;i++){
            if(this.titulos.get(i).equalsIgnoreCase(titulo)){
                throw new TituloException("El titulo "+titulo+" ya esta establecido para otro producto: "+(i+1));     
            }           
        }
        Autor autor = cargarAutor(sc);
        int paginas=sc.nextInt();
        if(paginas<10){
            throw new LibroException("El libro "+titulo+" no se puede ingresar debido a que debe de tener mas de 10 paginas, este solo tiene "+paginas);
        }
	String isbn = sc.next().trim();	
        libro = new Libro(isbn, titulo,paginas);
        libro.setAutor(autor);
        return libro;
    }
   private DVD cargarDVD(Scanner sc)throws TituloException,DVDException{ 
        DVD dvd = null;
        String titulo = sc.next().trim();
        if(titulo.length()> 100){
           throw new TituloException("Titulo incorrecto: "+titulo+". No puede ser mayor a 100 caracteres, este tiene "+titulo.length()+" caracteres" );
        }
        this.titulos.add(titulo);
        for(int i=0;i<this.titulos.size()-1;i++){
            if(this.titulos.get(i).equalsIgnoreCase(titulo)){
                throw new TituloException("El titulo "+titulo+" ya esta establecido para otro producto: "+(i+1));     
            }           
        }        
        int nAutores=sc.nextInt();
        if(nAutores>5||nAutores==0){
            throw new DVDException("El DVD "+titulo+" no se puede ingresar ya que debe de tener de 1 a 5 autores, este tiene " +nAutores+" autores");
        }
        Autor[] autores=new Autor[nAutores];
        for (int i=0;i<autores.length;i++){
            autores[i]=cargarAutor(sc);
        }
        int nActores=sc.nextInt();
        Autor[] actores=new Autor[nActores];
        for (int i=0;i<actores.length;i++){
            actores[i]=cargarAutor(sc);
        }
        double duracion = sc.nextDouble();
        if(duracion<20){
            throw new DVDException("El DVD "+titulo+" no se puede ingresar ya que la duracion debe de ser minimo de 20 minutos, este tiene "+duracion+" minutos de duracion");
        }
        dvd = new DVD( duracion, titulo,  actores,autores);
        return dvd;
   }
   private CD cargarCD(Scanner sc) throws TituloException,CDException{ 
        CD cd = null;
        String titulo = sc.next().trim();
        if(titulo.length()> 100){
           throw new TituloException("Titulo incorrecto: "+titulo+". No puede ser mayor a 100 caracteres, este tiene "+titulo.length()+" caracteres" );
        } 
        this.titulos.add(titulo);
        for(int i=0;i<this.titulos.size()-1;i++){
            if(this.titulos.get(i).equalsIgnoreCase(titulo)){
                throw new TituloException("El titulo "+titulo+" ya esta establecido para otro producto: "+(i+1));     
            }           
        }
         int nMusicos=sc.nextInt();
        Autor[] musicos=new Autor[nMusicos];
        for (int i=0;i<musicos.length;i++){
            musicos[i]=cargarAutor(sc);
        }
        String genero=sc.next().trim();
        int duracion = sc.nextInt();
        if(duracion<10||duracion>200){
            throw new CDException("El CD "+titulo+" no se puede ingresar ya que su duracion debe estar entre los 10 a los 200 minutos, este tiene una duracion de "+duracion+" minutos");
        }
        cd = new CD(genero,musicos,duracion,titulo);
        return cd;
   }
    
    public Soporte leerSoporte(Scanner sc) throws LibroException,TituloException,DVDException,CDException {
	String type = sc.next().trim();
	if (type.equals("Libro")) return cargarLibro(sc);
        else if(type.equals("DVD"))return cargarDVD(sc);
        else if (type.equals("CD"))return cargarCD(sc);
		return null; //Se debe completar
    }
	
    public ArrayList<Soporte> cargarSoportes(String archivo) throws FileNotFoundException, LibroException,TituloException,DVDException,CDException{
  	ArrayList<Soporte> soportes = new ArrayList<Soporte>();
	Scanner sc;
	sc = new Scanner(new File(archivo));
	sc.useDelimiter(",");
	while (sc.hasNext()) {
		soportes.add(leerSoporte(sc));
	}	
	return soportes;
   }
}
