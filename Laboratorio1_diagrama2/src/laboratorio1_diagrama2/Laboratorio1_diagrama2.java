package laboratorio1_diagrama2;

/**
 * @author Diego Duarte
 */
public class Laboratorio1_diagrama2 {

    /**
     * Programa que atraves de un ciclo principal y dos anidados a este, pondra una cantidad de espacios equivalente
     * al numero del contador-5, posteriormente pondra una cantidad de asteriscos equivalente a el contador*2,
     * al final de cada ciclo diferenciara el cambio de ciclo con un espacio.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cuenta_as=1,contador=1,blan=1,num=5;
        char ast='*',esp=' ';
        System.out.println("");
        for(;contador<=num;contador++){
            blan=num-contador;
            for(;blan>0;blan--){
                System.out.println(esp);
            }
            cuenta_as=1;
            for(;cuenta_as<(2*contador);cuenta_as++){
                System.out.println(ast);
            }
            System.out.println("");
        }
    }    
}
