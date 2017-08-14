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
public class Lista2_LacoRepeticao_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, maiorNum = 0; 
        
        for(int i = 1; i <= 10; i++){
            System.out.printf("Digite um Numero(%d): ",i);
            num = input.nextInt();
            
            if(num > maiorNum){
                maiorNum = num;
            }
            
        }
        
        System.out.println("o numero maior digitado é: " + maiorNum);
    }
}
