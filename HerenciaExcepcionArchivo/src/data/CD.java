/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class CD extends Soporte {
    private String genero;
    private Autor[] musicos;
    private double duracion;

    public CD(String genero, Autor[] musicos, double duracion, String titulo) {
        super(titulo);
        this.genero = genero;
        this.musicos = musicos;
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Autor[] getMusicos() {
        return musicos;
    }

    public void setMusicos(Autor[] musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        String estado;
        if(this.estado==true){
            estado="prestado";
        }else{
            estado="disponible";
        }
        return "CD{" + "titulo=" + super.getTitulo() + ", musicos=" + Arrays.toString(musicos) + ", duracion=" + duracion + ", genero=" + genero + ", estado=" + estado +'}';
    }  

    
    
}
