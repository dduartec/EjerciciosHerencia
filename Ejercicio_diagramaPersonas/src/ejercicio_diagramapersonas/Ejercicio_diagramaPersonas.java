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
public class Ejercicio_diagramaPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador admin=new Administrador("Gerente","Andres Restrepo","Jose Quintero","Carrera 30#14-24","Lunes a Viernes");
        System.out.println(admin.toString());
        admin.asistir();
        admin.cobrar();
        admin.administrar();
        Profesor profe=new Profesor("Ing.Sistemas","Tito Florez","Jonatan Gomez","Teusaquillo","lunes y miercoles");
        System.out.println(profe.toString());
        profe.asistir();
        profe.cobrar();
        profe.enseñar();
        Estudiante estudiante=new Estudiante(11,'C',"Diego Duarte","Calle 26","Lunes a Sabado") ;
        System.out.println(estudiante.toString());
        estudiante.asistir();
        estudiante.estudiar();
    }
    
}
