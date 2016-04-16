/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Diego
 */
public class JavaApplication8 {

    public static void main(String[] args) {
        char playAgain='y';
        java.util.Scanner lectura=
                new java.util.Scanner (System.in);
        do{
            GuessingGame();
            System.out.println("Would you like to play another game?(y/n)");
            playAgain=lectura.next().charAt(0);
            System.out.println(playAgain);
        }while(playAgain=='y');
    }
    public static void GuessingGame(){
        int answer=(int) Math.floor((Math.random()*100)+1);
        int guess=0,numGuesses=1;
        java.util.Scanner lectura=
                new java.util.Scanner (System.in);
        System.out.println(answer);
        while(numGuesses<=7||guess!=answer){
            System.out.println("Guess a number");
            guess=lectura.nextInt();
            if(guess<answer){
                System.out.println("Higher");
            }else{
                if(guess>answer){
                    System.out.println("Lower");
                }else{
                    System.out.println("You Win");
                    break;
                }
            }
            numGuesses++;
        }   
        if(numGuesses>7){
            System.out.println("You Lose");
        }
    }
}
