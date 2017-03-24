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
public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //VARIAVEIS
        int base;
        int exp;
        double r;
        
        //ENTRADA
        System.out.println("Calcula A Base e o Expoente");
        System.out.print("Base: ");
        base = console.nextInt();
        System.out.print("Expoente: ");
        exp = console.nextInt();
        
        //PROCESSAMENTO
        r = Math.pow(base ,exp);
        
        //SAIDA
        System.out.printf(base+ " elevado ao "+ exp + " é: %.2f ", r);
        
    }
}
