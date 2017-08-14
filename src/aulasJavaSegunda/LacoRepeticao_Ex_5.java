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
public class LacoRepeticao_Ex_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m = 1;
        
        System.out.println("Digite um Numero x: ");
        int x = input.nextInt();
        
        int r = 0;
        
        if(x >= 2 && x <= 1000){
            do{
                r = m * x;
                System.out.println(m+" X "+x+" = "+r);
                m = m + 1;
            }while(m < 11);
        }
    }
}
