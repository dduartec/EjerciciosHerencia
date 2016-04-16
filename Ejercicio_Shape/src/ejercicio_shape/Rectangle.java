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
public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4);//al ser un rectangulo el numero de lados siempre sera 4;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        double area;
        area=this.width*this.height;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimetro;
        perimetro=(2*this.width)+(2*this.height);
        return perimetro;
    }
    
    
    
}
