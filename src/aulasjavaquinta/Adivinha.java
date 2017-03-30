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
public class Adivinha {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random gerador = new Random();
        
        int numSorteado = gerador.nextInt(11);
        
        System.out.println("Adivinhe o Numero entre 1 a 10 :");
        int numA = console.nextInt();
        
        if(numA == numSorteado){
            System.out.println("Você Acertou!");
        }else{
            System.out.println("Você Errou!");
        }
        System.out.println(numSorteado);
        
    }
}
