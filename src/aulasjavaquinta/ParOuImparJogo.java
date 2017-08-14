/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class ParOuImparJogo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random gerador = new Random();
        
        int numSorteado = gerador.nextInt(11);
        
        System.out.println("Jogo do Par ou Impar \n Jogue um numero de 0 a 10:");
        int numPlayer = console.nextInt();
        
        int total = numSorteado + numPlayer;
        int parImpar = total % 2;
        
        System.out.println(parImpar);
        
        if(parImpar == 1){
            System.out.printf("Você: %d \nComputador: %d \nSoma: %d\n%d é Impar ",
                    numPlayer,
                    numSorteado,
                    total,
                    total);
        }else{
            System.out.printf("Você: %d \nComputador: %d \nSoma: %d\n%d é Par ",
                    numPlayer,
                    numSorteado,
                    total,
                    total);
        }
        
    }
}
