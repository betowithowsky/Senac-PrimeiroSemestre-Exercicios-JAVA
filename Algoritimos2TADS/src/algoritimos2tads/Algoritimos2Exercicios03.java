/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimos2tads;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class Algoritimos2Exercicios03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um Numero :");
        int num = input.nextInt();
        
        System.out.println(quadrado(num));
    }
    
    public static int quadrado(int num){
        int quad = 0;
        int impar = 1;
        for(int i = 1; i <= num; i++){
            quad += impar;
            impar += 2;
        }
        
        return quad;
    }
}
