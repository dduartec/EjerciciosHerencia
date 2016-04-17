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
public class Ejercicio_diagramaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante(11,'c',"Andres Garcia","Elm Street","Lunes a Viernes");
        Administrador administrador =new Administrador("gerente","Juan Rodriguez","Dante Quintero","avenida siempreviva","martes a sabado");
        Profesor profesor=new Profesor("Ingenieria de Sistemas","Cubides","Jonatan Gomez","Ningun Lugar","Lunes y Miercoles");
        System.out.println(estudiante.toString());
        estudiante.asistir();
        estudiante.estudiar();
        System.out.println(administrador.toString());
        administrador.asistir();
        administrador.cobrar();
        administrador.administrar();
        System.out.println(profesor.toString());
        profesor.asistir();
        profesor.cobrar();
        profesor.enseñar();
    }
    
}
