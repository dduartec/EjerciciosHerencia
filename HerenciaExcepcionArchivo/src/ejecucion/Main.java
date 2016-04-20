/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;
import Exception.CDException;
import Exception.DVDException;
import Exception.LibroException;
import Exception.PrestamoException;
import Exception.TituloException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ui.UI;

/**
 *
 * @author fabian.giraldo
 */
public class Main {

    public static void main(String[] args) throws DVDException, PrestamoException, LibroException, TituloException, CDException {
        //Luego se aplicara el patron arquitectonico Modelo - Vista - Controlador
        UI vista = new UI();
        int aux=1;
        Scanner scanner = new Scanner(System.in);
        boolean indicador = false;
        int opcion = 0;
        while(indicador == false){ 
            vista.menu();
        }
    }
}
