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
public class Rectagle extends Shape{
    private double width;
    private double height;

    public Rectagle(double width, double height) {
        super(4);//al ser un rectangulo siempre tendra 4 lados
        this.width = width;
        this.height = height;
    }

    public void getArea(){
        double area=width*height;
        System.out.println("area: "+area);
    }
    public void getPerimetre(){
        double perimetre=2*width+2*height;
        System.out.println("perimetre: "+perimetre);
    }

    
}
