/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
/**
 *
 * @author fabian.giraldo
 */
public class Soporte {
    private String titulo;
    private Autor autor;
    protected boolean estado;

    public Soporte (String titulo){
      this.titulo = titulo;
      this.estado=false;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String estado;
        if(this.estado==true){
            estado="prestado";
        }else{
            estado="disponible";
        }
        return "Soporte{" + "titulo=" + titulo + ", autor=" + autor + ", estado="+estado+'}';
    }
}