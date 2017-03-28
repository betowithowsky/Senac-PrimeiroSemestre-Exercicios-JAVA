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
public class CalculoMediaAritimetica {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Média Aritimética de 4 Numeros");
        System.out.println("Digite Numero A:");
        double numA = console.nextDouble();
        System.out.println("Digite Numero B:");
        double numB = console.nextDouble();
        System.out.println("Digite Numero C:");
        double numC = console.nextDouble();
        System.out.println("Digite Numero D:");
        double numD = console.nextDouble();
        
        double media = (numA + numB + numC + numD) / 4;
        
        System.out.printf("A Média Arimética de %.2f + %.2f + %.2f + %.2f é de %.2f",
                numA,
                numB,
                numC,
                numD,
                media);
    }
}
