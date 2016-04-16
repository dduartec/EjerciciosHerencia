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
public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);//al ser un triangulo el numero de lados siempre sera 3;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getArea(){
        double area;
        area=(this.width*this.height)/2;
        return area;
    }
    @Override
    public double getPerimeter(){
        //asumiendo que el triangulo es equilatero o isoceles:
        double perimetro,lado;
        if(this.height==this.width){//si es un triangulo rectangulo e isoceles 
            lado=Math.sqrt(2*Math.pow(this.height,2));
            perimetro=2*this.height+lado;
        }else{        
            lado=Math.sqrt(Math.pow(this.width/2,2)+Math.pow(this.height,2));
            perimetro=this.width+(2*lado);           
        }
        return perimetro;
    }
}
