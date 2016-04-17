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
public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);//al ser un triangulo siempre tendra 3 lados
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea(){
        double area=(width*height)/2;
        System.out.println("area: "+area);
    }
    @Override
    public void getPerimetre(){
        double perimetre,lado;
        //suponiendo que es equilatero o isoceles, ya que el perimetro es dificil de hllar si solo nos dan el ancho y la altura
        if(width==height){//si es equilatero rectangulo
            lado=Math.sqrt(2*(Math.pow(width,2)));
            perimetre=2*width+lado;
        }else{
            lado=Math.sqrt(Math.pow(width/2,2)+Math.pow(height,2));
            perimetre=width+2*lado;
        }        
        System.out.println("perimetre: "+perimetre);
    }
    
}
