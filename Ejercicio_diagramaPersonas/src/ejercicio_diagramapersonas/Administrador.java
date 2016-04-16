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
public class Administrador extends Empleado {
    private String puesto;

    public Administrador(String puesto, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.puesto = puesto;
    }
    public void administrar(){
        System.out.println("administrar");
    }

    @Override
    public String toString() {
        return "Administrador{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", horario=" + horario  + ",jefe=" + jefe + ",puesto=" + puesto + '}';
    }
    
}
