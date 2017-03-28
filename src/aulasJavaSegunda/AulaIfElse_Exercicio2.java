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
public class AulaIfElse_Exercicio2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //ENTRADA
        System.out.print("Digite um Numero A: ");
        double numA = console.nextDouble();
        System.out.print("Digite um Numero B: ");
        double numB = console.nextDouble();
        
        //PROCESSO/SAIDA
        if(numA % numB == 0){
            System.out.printf("A divisão de " +numA+ " por " +numB+ " é exata. ");
        }else{
            System.err.printf("A divisão de " +numA+ " por " +numB+ " Não é exata. ");
        }
        
        
    }
}
