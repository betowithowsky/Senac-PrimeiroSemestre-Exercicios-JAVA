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
        for(int i = 0; i < num; i++){
            quad += num;
        }
        
        return quad;
    }
}
