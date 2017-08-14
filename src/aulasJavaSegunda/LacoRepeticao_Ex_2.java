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
public class LacoRepeticao_Ex_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valor = 0;
        
        System.out.println("Digite um Valor X");
        valor = input.nextInt();
        
        for(int i = 1; i < valor; i = i + 2){
            int impar = i;
            System.out.println(impar + " numero X: " + valor);
        }
    }
}
