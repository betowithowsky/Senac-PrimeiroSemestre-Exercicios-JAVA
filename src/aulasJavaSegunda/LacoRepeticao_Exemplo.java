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
public class LacoRepeticao_Exemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x, soma = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o Item" + i);
            x = input.nextInt();
            soma = soma + x;
        }
        
        System.out.println("TOTAL: " + soma);
        
        int i = 0;
        
        while(i < 10){
            System.out.println("ALGORITIMOS I");
            i = i + 1;
        }
    }
}
