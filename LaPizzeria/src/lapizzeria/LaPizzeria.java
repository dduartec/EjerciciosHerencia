
package lapizzeria;

import java.util.Scanner;


public class LaPizzeria {

    
    public static void main(String[] args) {
        start();
       
        }
        
         public static void start(){
    Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la app de LA PIZZERIA \n" + 
                "Seleccione el tipo de pizza que desea: \n" +
                "1.Pepperoni \n" +
                "2.Vegetariana \n" +
                "3.Queso \n" +
                "4.Salir");
        switch (leer.nextInt()) {
            case 1:
                Pepperoni p= new Pepperoni();
                p.entrega();
                start();
                break;
            case 2:
                Vegetariana v = new Vegetariana();
                v.entrega();
                start();
                break;
            case 3:
                Queso q = new Queso();
                q.entrega();
                start();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida \n");
                start();
                break;
        }
        
    }
    
   
        
    
    }
    

