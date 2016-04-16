
package laboratorio1_diagrama3;

/**
 * @author Diego Duarte
 */
public class Laboratorio1_diagrama3 {

    /**
     * Programa que imprime en pantalla: "primera funcion en Main", posteriormente llama a una funcion 1, esta imprime:
     * "Segunda funcion" y llama a una funcion 2, esta ultima imprime :"tercera funcion", y al terminar vuleve al main,
     * de manera que por ultimo imprime "Se termina main".
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Primera Funcion en Main");
        func1();
        func2();
        System.out.println("Se termina Main");
    }
    public static void func1(){
       System.out.println("Segunda Funcion"); 
    }
    public static void func2(){
       System.out.println("Tercera Funcion");
    }
}
