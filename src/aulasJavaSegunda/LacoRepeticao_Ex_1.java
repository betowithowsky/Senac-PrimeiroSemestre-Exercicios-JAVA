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
public class LacoRepeticao_Ex_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Numeros Pares Entre 1 e 100");
        int i = 0;
        int pares = 2;
        
        while(i < 100){
           
            System.out.println(": " + pares);
            pares = pares + 2;
            i = i + 2;
        }
    }
}
