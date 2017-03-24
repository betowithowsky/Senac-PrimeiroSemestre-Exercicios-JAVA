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
public class CalculoRaizQuadrada {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //VARIAVEIS
        int raiz;
        double r;
        
        //ENTRADA
        System.out.println("Calcula a Raiz Quadrada");
        System.out.print("Base: ");
        raiz = console.nextInt();
        
        //PROCESSO
        r = Math.sqrt(raiz);
                
        //SAIDA
        System.out.println("A Raiz Quadrada de: " +raiz + " é: " + r);
    }
}
