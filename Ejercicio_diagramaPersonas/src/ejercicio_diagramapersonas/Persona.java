/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_diagramapersonas;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Persona {
    protected String nombre;
    protected String domicilio;
    protected String horario;

    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
    } 
    
    public void asistir(){
        System.out.println("asistir");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", horario=" + horario + '}';
    }
    
    
}
