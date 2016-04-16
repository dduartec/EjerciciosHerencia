/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Diego
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Echo el = new Echo();
        Echo e2 = new Echo();
        int x=0;
        while (x<4){
            el.hello();
            el.count=el.count+1;
            if(x==4){
                e2.count=e2.count+1;
            }
            if(x<4){
                e2.count=e2.count+el.count;
            }
            x++;
        }
        System.out.println(e2.count);
    }
    
}
