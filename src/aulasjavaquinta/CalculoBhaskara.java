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
        
        //ENTRADAS
        System.out.print("Coloque o Valor de X1: ");
        double x1 = console.nextDouble();
        
        System.out.print("Coloque o Valor de X2: ");
        double x2 = console.nextDouble();
        
        System.out.print("Coloque o Valor de C: ");
        double c = console.nextDouble();
        
        //PROCESSAMENTO
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = - (s * a);
        
        //SAIDA
        System.out.println("A equação que tem raizes x1: " +x1+ " e x2: " +x2+ " é " +a+ "xª + " +b+ "x + " +c);
               
        
    }
}
