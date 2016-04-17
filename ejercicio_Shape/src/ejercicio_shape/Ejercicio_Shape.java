/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_shape;

/**
 *
 * @author Diego
 */
public class Ejercicio_Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectagle rectangulo=new Rectagle(4,4);
        System.out.println("numero de lados: "+rectangulo.getNumSides());
        rectangulo.getArea();
        rectangulo.getPerimetre();
        Triangle triangulo=new Triangle(3,3);
        System.out.println("numero de lados: "+triangulo.getNumSides());
        triangulo.getArea();
        triangulo.getPerimetre();
        
    }
    
}
