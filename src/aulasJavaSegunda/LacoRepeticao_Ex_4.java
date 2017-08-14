/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class LacoRepeticao_Ex_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int x = 0;
        int soma = 0;
        int positivos = 0;
        int media = 0;
        
        while(i < 6){
            System.out.println("Digite um valor " + i);
            x = input.nextInt();
            if(x > 0){
                soma = soma + x;
                positivos = positivos + 1;
                media = soma / positivos;
            }
            i = i + 1;
            
        }
        System.out.printf("Soma: %d\nNumeros Positivos: %d\nMedia (Decimal): %d\n",
                soma,
                positivos,
                media);
    }
}
