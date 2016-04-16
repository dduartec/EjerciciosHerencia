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
public class Estudiante extends Persona{
    private int grado;
    private char grupo;

    public Estudiante(int grado, char grupo, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }
    public void estudiar(){
        System.out.println("estudiar");
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", horario=" + horario+ ",grado=" + grado + ", grupo=" + grupo + '}';
    }
    
    
}
