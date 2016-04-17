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
public class Profesor extends Empleado {
    private String carrera;

    public Profesor(String carrera, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.carrera = carrera;
    }

    public void enseñar(){
        System.out.println("enseñar");
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "carrera=" + carrera + '}';
    }
    
    
}
