/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_shape;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Ejercicio_Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangulo =new Rectangle(2,2);
        Triangle triangulo = new Triangle(4,3);
        System.out.println("Area rectangulo: "+rectangulo.getArea());
        System.out.println("Perimetro rectangulo: "+rectangulo.getPerimeter());
        System.out.println("Numero de lados rectangulo: "+rectangulo.getNumSides());
        System.out.println("Area triangulo: "+triangulo.getArea());
        System.out.println("Perimetro triangulo: "+triangulo.getPerimeter());
        System.out.println("Numero de lados triangulo: "+triangulo.getNumSides());
    }
    
}
