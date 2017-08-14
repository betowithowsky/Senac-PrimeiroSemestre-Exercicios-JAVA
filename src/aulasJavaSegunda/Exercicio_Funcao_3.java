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
public class Exercicio_Funcao_3 {
    static String status;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        
        System.out.println(verificaParImpar(num));
        
    }
   
    static String verificaParImpar(int num){
        if(num % 2 == 0){
            status = "Par";
        }else{
            status = "impar";
        }
        return status;
    }
}
