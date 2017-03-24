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
public class CalculoTresNumerosDecimais {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        //VARIAVEIS
        int numeroA, numeroB, numeroC;
        double rA,rB,rC,rD,rE,rF; //Resposta A,B,C,D,E e F
                
        
        //ENTRADA
        System.out.print("Digite o Valor A: ");
        numeroA = console.nextInt();
        System.out.print("Digite o Valor B: ");
        numeroB = console.nextInt();
        System.out.print("Digite o Valor C: ");
        numeroC = console.nextInt();
        
        //PROCESSO
        rA = numeroA * numeroC /2; // a) a área do triângulo retângulo que tem A por base e C por altura. R = baseA * alturaC/2
        rB = Math.PI * Math.sqrt(numeroC); // b) a área do círculo de raio C. (π = 3.14159). R = 3,14 * numeroC²
        rC = numeroA + numeroB * numeroC/2; // c) a área do trapézio que tem A e B por bases e C por altura. R = baseA + baseB * baseC/2
        rD = Math.pow(numeroB, 2); // d) a área do quadrado que tem lado B. R = baseB * baseB
        rE = numeroA * numeroB; // e) a área do retângulo que tem lados A e B. R = baseA * alturaB
        rF = 2*(numeroA+numeroB); // f) o perímetro do retângulo que tem lados A e B. R = 2*(baseA+alturaB)
        
        //SAIDA
        System.out.println("A Área do Triângulo retângulo é: " +rA+ " m²");
        System.out.println("A Área do Ciculo do Radio é: " +rB+ " m²");
        System.out.println("A Área do Trapézio é: " +rC+ " m²");
        System.out.println("A Área do Quadrado é: " +rD+ " m²");
        System.out.println("A Área do Retângulo é: " +rE+ " m²");
        System.out.println("A Perímetro do Retângulo é: " + rF+ " m²");  
        
    }
}
