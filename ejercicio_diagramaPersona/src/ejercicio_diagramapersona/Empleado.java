/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_diagramapersona;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Empleado extends Persona{
    protected String jefe;

    public Empleado(String jefe, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }
    
    public void cobrar(){
        System.out.println("cobrar");
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "jefe=" + jefe + '}';
    }


    
}
