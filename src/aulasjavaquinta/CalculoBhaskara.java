/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class CalculoBhaskara {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        //Calculo de Bhaskara
        
        //ENTRADA
        System.out.println("Coloque o Valor de A: ");
        double a = console.nextDouble();
        
        System.out.println("Coloque o Valor de B: ");
        double b = console.nextDouble();
        
        System.out.println("Coloque o Valor de C: ");
        double c = console.nextDouble();
        
        //PROCESSAMENTO
        double delta = (b*b) - ((4 * a) * c);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        
        //SAIDA
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
