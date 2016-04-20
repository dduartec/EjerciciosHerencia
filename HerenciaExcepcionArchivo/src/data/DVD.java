
package data;

import java.util.Arrays;

public class DVD extends Soporte {
    double duracion;
    private Autor[] autores;
    private Autor[] actores;

    public DVD(double duracion, String titulo, Autor[] actores,Autor[] autores) {
        super(titulo);
        this.autores = autores;
        this.duracion = duracion;
        this.actores = actores;
    }
    

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Autor[] getActores() {
        return actores;
    }

    public void setActores(Autor[] actores) {
        this.actores = actores;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }
        

    @Override
    public String toString() {
        String estado;
        if(this.estado==true){
            estado="prestado";
        }else{
            estado="disponible";
        }
            return "DVD{" + "titulo=" + super.getTitulo() + ", autores"+ Arrays.toString(autores) + ", duracion=" + duracion + ", actores=" + Arrays.toString(actores) + ", estado=" + estado +'}';
    }   
}
